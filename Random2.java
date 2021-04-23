import java.util.ArrayList;
import java.util.Random;


public class Random2 implements Bot {
	
	private BoardAPI board;
	private PlayerAPI player;

	
	Random2 (BoardAPI inBoard, PlayerAPI inPlayer) {
		board = inBoard;	
		player = inPlayer;
		return;
	}
	
	public String getName () {
		String command = "";
		command = "Random2Bot";
		return(command);
	}

	public String getReinforcement () {
		ArrayList<Integer> countries = new ArrayList<Integer>();
		int a;
		
		for (int i = 0; i < GameData.NUM_COUNTRIES; i++){
			if (board.getOccupier(i) == player.getId()){
				countries.add(i);
			}
		}
		
			int rnd = new Random().nextInt(countries.size());
			a = countries.get(rnd);
		
		String attackf = GameData.COUNTRY_NAMES[a];
		attackf = attackf.replaceAll("\\s", "");
		String command = attackf;
		command += " 1";
		return(command);
	}
	
	public String getPlacement (int forPlayer) {
		String command = "";
		command = GameData.COUNTRY_NAMES[(int)(Math.random() * GameData.NUM_COUNTRIES)];
		command = command.replaceAll("\\s", "");
		return(command);
	}
	
	public String getCardExchange () {
		String command = "";
		if (player.isForcedExchange()){
			ArrayList<Card> Playercards = player.getCards();
			
			int i = 0;
			int c = 0;
			int a = 0;
			int w = 0;
			for (Card card : Playercards){
			if(card.getInsigniaId()==0) { 
				i++;
			}
			else if(card.getInsigniaId()==1) {
				i++;
			}
			else if(card.getInsigniaId()==2) {
				i++;
			}
			else {
				w++;
			}
			}
			
			for (int x = 0; x < w; x++){
				command += "w";
			}
			
			while (command.length() < 3 && i < Playercards.size()){
				if (i + w > 2){
					command += "i";
				}
				else if (c + w > 2){
					command += "c";
				}
				else if (a + w > 2){
					command += "a";
				}
				else if ((i + c + a) > 2){
					command = "ica";
				}
			}
		}
		
		else command = "skip";
		return(command);
	}

	public String getBattle () {
		int a;
        int numunits;
		String command = "";
		String attackf = "";
		String attackt = "";
		ArrayList<Integer> opposition = new ArrayList<Integer>();
		ArrayList<Integer> countries = new ArrayList<Integer>();
		int y = (int)(Math.random() * 5);
		if (y != 3){
			for (int x = 0; x < GameData.NUM_COUNTRIES; x++){
				if (board.getOccupier(x) == player.getId()){
					countries.add(x);
				}
			}

			do { 
				int rnd = new Random().nextInt(countries.size());
				a = countries.get(rnd);
			} while (board.getNumUnits(a) < 2);

			int[] adj = GameData.ADJACENT[a];
			attackf = GameData.COUNTRY_NAMES[a];
			attackf = attackf.replaceAll("\\s", "");
			
			for (int i = 0; i < adj.length; i++){
				if (board.getOccupier(adj[i]) != player.getId()){
					opposition.add(adj[i]);
				}
			}
			
			if (opposition.size() > 0){
				int k = (int) (Math.random() * adj.length);
				attackt = GameData.COUNTRY_NAMES[adj[k]];
				attackt = attackt.replaceAll("\\s", ""); 
			
				if (board.getNumUnits(a) == 2){
					numunits = 1;
				}
				else if (board.getNumUnits(a) == 3){
					numunits = 2;
				}
				else {
					numunits = 3;
				}
				command = attackf + " " + attackt + " " + numunits;
			}
		
			else command = "skip";
		}
		
		else command = "skip";	
		return(command);
	}	

	public String getDefence (int countryId) {
		
		String command = "";
		if (board.getNumUnits(countryId) < 2){
			command = "1";
		}
		else command = "2";
		
		return(command);
	}

	public String getMoveIn (int attackCountryId) {
		String command = "";
		command = "1";
		System.out.println(command);
		return(command);
	}

	public String getFortify () {
		String command = ""; 
		command = "skip";
		return(command);
	}
	}
	}
