public class Sprint3 {

	public static void main (String args[]) {	   
		Board board = new Board();
		UI ui = new UI(board);
		Player[] players = new Player[GameData.NUM_PLAYERS_PLUS_NEUTRALS];
		Player currPlayer;
		Card card;
		int playerId, countryId, numUnits, numCards;
		String name;
		
		ui.displayString("ENTER PLAYER NAMES");
		ui.displayMap();
		for (playerId=0; playerId<GameData.NUM_PLAYERS_PLUS_NEUTRALS; playerId++) {
			if (playerId < GameData.NUM_PLAYERS) {
				name = ui.inputName(playerId);
				numUnits = GameData.INIT_UNITS_PLAYER;
			} else {
				name = "Neutral " + (playerId - GameData.NUM_PLAYERS + 1);
				ui.displayName(playerId,name);
				numUnits = GameData.INIT_UNITS_NEUTRAL;
			}
			players[playerId] = new Player (playerId, name, numUnits);
		}
		
		ui.displayString("\nDRAW TERRITORY CARDS FOR STARTING COUNTRIES");
		Deck deck = new Deck();
		for (playerId=0; playerId<GameData.NUM_PLAYERS_PLUS_NEUTRALS; playerId++) {
			currPlayer = players[playerId];
			if (playerId < GameData.NUM_PLAYERS) {
				numCards = GameData.INIT_COUNTRIES_PLAYER;
			} else {
				numCards = GameData.INIT_COUNTRIES_NEUTRAL;
			}
			for (int i=0; i<numCards; i++) {
				card = deck.getCard();
				ui.displayCardDraw(currPlayer, card);
				currPlayer.subtractUnits(1);
				board.addUnits(card, currPlayer, 1);
			}
		}
		ui.displayMap();
		
		ui.displayString("\nROLL DICE TO SEE WHO REINFORCES THEIR COUNTRIES FIRST");
		do {
			for (int i=0; i<GameData.NUM_PLAYERS; i++) {
				players[i].rollDice(1);
				ui.displayDice(players[i]);
			}
		} while (players[0].getDie(0) == players[1].getDie(0)); 
		if (players[0].getDie(0) > players[1].getDie(0)) {
			playerId = 0;
		} else {
			playerId = 1;
		}
		currPlayer = players[playerId];
		ui.displayRollWinner(currPlayer);
		
		ui.displayString("\nREINFORCE INITIAL COUNTRIES");
		while (currPlayer.getNumUnits() > 0) {
			ui.inputPlacement(currPlayer, currPlayer);
			countryId = ui.getCountryId();
			currPlayer.subtractUnits(3);
			board.addUnits(countryId, currPlayer, 3);
			ui.displayMap();
			for (int i=GameData.NUM_PLAYERS; i<GameData.NUM_PLAYERS_PLUS_NEUTRALS; i++) {
				ui.inputPlacement(currPlayer, players[i]);
				countryId = ui.getCountryId();
				currPlayer.subtractUnits(1);
				board.addUnits(countryId, currPlayer, 1);	
				ui.displayMap();
			}
			playerId = (++playerId)%GameData.NUM_PLAYERS;
			currPlayer = players[playerId];
		}
		
		ui.displayString("\nROLL DICE TO SEE WHO TAKES THE FIRST TURN");
		do {
			for (int i=0; i<GameData.NUM_PLAYERS; i++) {
				players[i].rollDice(1);
				ui.displayDice(players[i]);
			}
		} while (players[0].getDie(0) == players[1].getDie(0)); 
		if (players[0].getDie(0) > players[1].getDie(0)) {
			playerId = 0;
		} else {
			playerId = 1;
		}
		currPlayer = players[playerId];
		ui.displayRollWinner(currPlayer);
		
		ui.displayString("\nSTART TURNS\n");
		do {
            otherPlayerId = (playerId+1)%GameData.NUM_PLAYERS;
            otherPlayer = players[otherPlayerId];

            // 1. Reinforcements
            numUnits = board.calcReinforcements(currPlayer);
            currPlayer.addUnits(numUnits);
            ui.displayReinforcements(currPlayer, numUnits);
            do {
                ui.inputReinforcement(currPlayer);
                currPlayer.subtractUnits(ui.getNumUnits());
                board.addUnits(ui.getCountryId(),currPlayer,ui.getNumUnits());
                ui.displayMap();
            } while (currPlayer.getNumUnits() > 0);

            // 2. Combat
            do {
                ui.inputBattle(currPlayer);
                if (!ui.isTurnEnded()) {
                    attackUnits = ui.getNumUnits();
                    attackCountryId = ui.getFromCountryId();
                    defenceCountryId = ui.getToCountryId();
                    defencePlayer = players[board.getOccupier(defenceCountryId)];
                    if (board.getNumUnits(defenceCountryId) > 1) {
                        ui.inputDefence(otherPlayer,defenceCountryId);
                        defenceUnits = ui.getNumUnits();
                    } else {
                        defenceUnits = 1;
                    }
                    board.calcBattle(currPlayer,defencePlayer,attackCountryId,defenceCountryId,attackUnits,defenceUnits);
                    ui.displayBattle(currPlayer,defencePlayer);
                    ui.displayMap();
                    if ( board.isInvasionSuccess() && (board.getNumUnits(attackCountryId) > 1) ) {
                        ui.inputMoveIn(currPlayer,attackCountryId);
                        board.subtractUnits(attackCountryId, ui.getNumUnits());
                        board.addUnits(defenceCountryId, currPlayer, ui.getNumUnits());
                        ui.displayMap();
                    }
                }

            } while (!ui.isTurnEnded() && !board.isGameOver());

            // 3. Fortify
            if (!board.isGameOver()) {
                ui.inputFortify(currPlayer);
                if (!ui.isTurnEnded()) {
                    board.subtractUnits(ui.getFromCountryId(), ui.getNumUnits());
                    board.addUnits(ui.getToCountryId(), currPlayer, ui.getNumUnits());
                    ui.displayMap();
                }
            }

            playerId = (playerId+1)%GameData.NUM_PLAYERS;
            currPlayer = players[playerId];

        } while (!board.isGameOver());

        ui.displayWinner(players[board.getWinner()]);
        ui.displayString("GAME OVER");

        return;
    }


}
