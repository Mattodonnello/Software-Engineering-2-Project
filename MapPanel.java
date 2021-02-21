import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class MapPanel{
	// Declare our constant variables
	  private final JPanel myPanel;
	  private final InfoPanel infoPanel;
	  private static CommandPanel commandPanel = new CommandPanel();
	  // Declare our Frame_Width and height
	  private static final int FRAME_WIDTH = 1000;   
	  private static final int FRAME_HEIGHT = 600;
	  private static JFrame frame;
	  
	  public MapPanel() {
	  myPanel = new JPanel();
	  myPanel.setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
	  myPanel.setBackground(Color.BLACK);
      Draw s = new Draw();
      infoPanel = new InfoPanel();
      commandPanel = new CommandPanel();
      
   // Declare your 42 Country name labels
        JLabel lbl1 = new JLabel("Ontario");
		JLabel lbl2 = new JLabel("Quebec");
		JLabel lbl3 = new JLabel("NW Territory");
		JLabel lbl4 = new JLabel("Alberta");
		JLabel lbl5 = new JLabel("Greenland");
		JLabel lbl6 = new JLabel("E United States");
		JLabel lbl7 = new JLabel("W United States");
		JLabel lbl8 = new JLabel("Central America");
		JLabel lbl9 = new JLabel("Alaska");
		JLabel lbl10 = new JLabel("Great Britain");
		JLabel lbl11 = new JLabel("W Europe");
		JLabel lbl12 = new JLabel("S Europe");
		JLabel lbl13 = new JLabel("Ukraine");
		JLabel lbl14 = new JLabel("N Europe");
		JLabel lbl15 = new JLabel("Iceland");
		JLabel lbl16 = new JLabel("Scandinavia");
		JLabel lbl17 = new JLabel("Afghanistan");
		JLabel lbl18 = new JLabel("India");
		JLabel lbl19 = new JLabel("Middle East");
		JLabel lbl20 = new JLabel("Japan");
		JLabel lbl21 = new JLabel("Ural");
		JLabel lbl22 = new JLabel("Yakutsk");
		JLabel lbl23 = new JLabel("Kamchatka");
		JLabel lbl24 = new JLabel("Siam");
		JLabel lbl25 = new JLabel("Irkutsk");
		JLabel lbl26 = new JLabel("Siberia");
		JLabel lbl27 = new JLabel("Mongolia");
		JLabel lbl28 = new JLabel("China");
		JLabel lbl29 = new JLabel("E Australia");
		JLabel lbl30 = new JLabel("New Guinea");
		JLabel lbl31 = new JLabel("W Australia");
		JLabel lbl32 = new JLabel("Indonesia");
		JLabel lbl33 = new JLabel("Venezuela");
		JLabel lbl34 = new JLabel("Peru");
		JLabel lbl35 = new JLabel("Brazil");
		JLabel lbl36 = new JLabel("Argentina");
		JLabel lbl37 = new JLabel("Congo");
		JLabel lbl38 = new JLabel("N Africa");
		JLabel lbl39 = new JLabel("S Africa");
		JLabel lbl40 = new JLabel("Egypt");
		JLabel lbl41 = new JLabel("E Africa");
		JLabel lbl42 = new JLabel("Madagascar");
		
		// Declare your 6 continent names
		JLabel continent1 = new JLabel("Asia (12)");
		JLabel continent2 = new JLabel("North America (9)");
		JLabel continent3 = new JLabel("Europe (7)");
		JLabel continent4 = new JLabel("Australia (4)");
		JLabel continent5 = new JLabel("Africa (6)");
		JLabel continent6 = new JLabel("South America (4)");
      
		// Declare Null layout and black background for the map panel
        myPanel.setLayout(null);
		// myPanel.setBackground(Color.BLACK);

		// Add our country and continent labels
		myPanel.add(lbl1);
		myPanel.add(lbl2);
		myPanel.add(lbl3);
		myPanel.add(lbl4);
		myPanel.add(lbl5);
		myPanel.add(lbl6);
		myPanel.add(lbl7);
		myPanel.add(lbl8);
		myPanel.add(lbl9);
		myPanel.add(lbl10);
		myPanel.add(lbl11);
		myPanel.add(lbl12);
		myPanel.add(lbl13);
		myPanel.add(lbl14);
		myPanel.add(lbl15);
		myPanel.add(lbl16);
		myPanel.add(lbl17);
		myPanel.add(lbl18);
		myPanel.add(lbl19);
		myPanel.add(lbl20);
		myPanel.add(lbl21);
		myPanel.add(lbl22);
		myPanel.add(lbl23);
		myPanel.add(lbl24);
		myPanel.add(lbl25);
		myPanel.add(lbl26);
		myPanel.add(lbl27);
		myPanel.add(lbl28);
		myPanel.add(lbl29);
		myPanel.add(lbl30);
		myPanel.add(lbl31);
		myPanel.add(lbl32);
		myPanel.add(lbl33);
		myPanel.add(lbl34);
		myPanel.add(lbl35);
		myPanel.add(lbl36);
		myPanel.add(lbl37);
		myPanel.add(lbl38);
		myPanel.add(lbl39);
		myPanel.add(lbl40);
		myPanel.add(lbl41);
		myPanel.add(lbl42);
		myPanel.add(continent1);
		myPanel.add(continent2);
		myPanel.add(continent3);
		myPanel.add(continent4);
		myPanel.add(continent5);
		myPanel.add(continent6);
		myPanel.add(s);
		s.setSize(990,599);
		
		// Add coordinates for your labels 
		lbl1.setLocation(191, 150);
		lbl2.setLocation(255, 161);
		lbl3.setLocation(146, 86);
		lbl4.setLocation(123, 144);
		lbl5.setLocation(314, 61);
		lbl6.setLocation(205, 235);
		lbl7.setLocation(135, 219);
		lbl8.setLocation(140, 299);
		lbl9.setLocation(45, 89);
		lbl10.setLocation(370, 199);
		lbl11.setLocation(398, 280);
		lbl12.setLocation(465, 270);
		lbl13.setLocation(547, 180);
		lbl14.setLocation(460, 200);
		lbl15.setLocation(393, 127);
		lbl16.setLocation(463, 122);
		lbl17.setLocation(628, 227);
		lbl18.setLocation(679, 332);
		lbl19.setLocation(572, 338);
		lbl20.setLocation(861, 213);
		lbl21.setLocation(645, 152);
		lbl22.setLocation(763, 70);
		lbl23.setLocation(827, 94);
		lbl24.setLocation(751, 360);
		lbl25.setLocation(750, 140);
		lbl26.setLocation(695, 108);
		lbl27.setLocation(760, 216);
		lbl28.setLocation(735, 277);
		lbl29.setLocation(889, 537);
		lbl30.setLocation(850, 429);
		lbl31.setLocation(813, 526);
		lbl32.setLocation(771, 454);
		lbl33.setLocation(213, 352);
		lbl34.setLocation(221, 426);
		lbl35.setLocation(289, 415);
		lbl36.setLocation(233, 523);
		lbl37.setLocation(496, 462);
		lbl38.setLocation(440,393);
		lbl39.setLocation(510, 532);
		lbl40.setLocation(499, 354);
		lbl41.setLocation(547, 432);
		lbl42.setLocation(586, 545);
		continent1.setLocation(35, 460);
		continent2.setLocation(35, 480);
		continent3.setLocation(35, 500);
		continent4.setLocation(35, 520);
		continent5.setLocation(35, 540);
		continent6.setLocation(35, 560);
		
		// Colour each of our country labels depending 
		// upon the continent they belong to
		lbl1.setForeground(Color.YELLOW);
		lbl2.setForeground(Color.YELLOW);
		lbl3.setForeground(Color.YELLOW);
		lbl4.setForeground(Color.YELLOW);
		lbl5.setForeground(Color.YELLOW);
		lbl6.setForeground(Color.YELLOW);
		lbl7.setForeground(Color.YELLOW);
		lbl8.setForeground(Color.YELLOW);
		lbl9.setForeground(Color.YELLOW);
		lbl10.setForeground(Color.BLUE);
		lbl11.setForeground(Color.BLUE);
		lbl12.setForeground(Color.BLUE);
		lbl13.setForeground(Color.BLUE);
		lbl14.setForeground(Color.BLUE);
		lbl15.setForeground(Color.BLUE);
		lbl16.setForeground(Color.BLUE);
		lbl17.setForeground(Color.GREEN);
		lbl18.setForeground(Color.GREEN);
		lbl19.setForeground(Color.GREEN);
		lbl20.setForeground(Color.GREEN);
		lbl21.setForeground(Color.GREEN);
		lbl22.setForeground(Color.GREEN);
		lbl23.setForeground(Color.GREEN);
		lbl24.setForeground(Color.GREEN);
		lbl25.setForeground(Color.GREEN);
		lbl26.setForeground(Color.GREEN);
		lbl27.setForeground(Color.GREEN);
		lbl28.setForeground(Color.GREEN);
		lbl29.setForeground(Color.PINK);
		lbl30.setForeground(Color.PINK);
		lbl31.setForeground(Color.PINK);
		lbl32.setForeground(Color.PINK);
		lbl33.setForeground(Color.RED);
		lbl34.setForeground(Color.RED);
		lbl35.setForeground(Color.RED);
		lbl36.setForeground(Color.RED);
		lbl37.setForeground(Color.ORANGE);
		lbl38.setForeground(Color.ORANGE);
		lbl39.setForeground(Color.ORANGE);
		lbl40.setForeground(Color.ORANGE);
		lbl41.setForeground(Color.ORANGE);
		lbl42.setForeground(Color.ORANGE);
		
		// Allocate our continent labels the colour they are assigned
		continent1.setForeground(Color.GREEN);
		continent2.setForeground(Color.YELLOW);
		continent3.setForeground(Color.BLUE);
		continent4.setForeground(Color.PINK);
		continent5.setForeground(Color.ORANGE);
		continent6.setForeground(Color.RED);
		
		// Set labels size so they actually appear on our map
		lbl1.setSize(150, 15);
		lbl2.setSize(150, 15);
		lbl3.setSize(150, 15);
		lbl4.setSize(150, 15);
		lbl5.setSize(150, 15); 
		lbl6.setSize(150, 15);
		lbl7.setSize(150, 15);
		lbl8.setSize(150, 15);
		lbl9.setSize(150, 15);
		lbl10.setSize(150, 15); 
		lbl11.setSize(150, 15);
		lbl12.setSize(150, 15);
		lbl13.setSize(150, 15);
		lbl14.setSize(150, 15);
		lbl15.setSize(150, 15); 
		lbl16.setSize(150, 15);
		lbl17.setSize(150, 15);
		lbl18.setSize(150, 15);
		lbl19.setSize(150, 15);
		lbl20.setSize(150, 15); 
		lbl21.setSize(150, 15);
		lbl22.setSize(150, 15);
		lbl23.setSize(150, 15);
		lbl24.setSize(150, 15);
		lbl25.setSize(150, 15); 
		lbl26.setSize(150, 15);
		lbl27.setSize(150, 15);
		lbl28.setSize(150, 15);
		lbl29.setSize(150, 15);
		lbl30.setSize(150, 15); 
		lbl31.setSize(150, 15);
		lbl32.setSize(150, 15);
		lbl33.setSize(150, 15);
		lbl34.setSize(150, 15);
		lbl35.setSize(150, 15); 
		lbl36.setSize(150, 15);
		lbl37.setSize(150, 15);
		lbl38.setSize(150, 15);
		lbl39.setSize(150, 15);
		lbl40.setSize(150, 15); 
		lbl41.setSize(150, 15);
		lbl42.setSize(150, 15);
		continent1.setSize(150, 15);
		continent2.setSize(150, 15);
		continent3.setSize(150, 15);
		continent4.setSize(150, 15); 
		continent5.setSize(150, 15);
		continent6.setSize(150, 15);
		
		// Add armies to our map using class AddArmies
		AddArmies a = new AddArmies(myPanel);
		
		// Create new frame and add our three panels to it 
  	    frame = new JFrame();
		frame.setSize(FRAME_WIDTH, 800);
		frame.setTitle("Risk");
		frame.add(myPanel, BorderLayout.NORTH);
		frame.add(infoPanel, BorderLayout.CENTER);
		frame.add(commandPanel,BorderLayout.SOUTH);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  }
	  
	  // Main function 
	  public static void main (String args[]) {
		// Declare our map panel
		MapPanel mapPanel = new MapPanel();
		int playerId=0;
		int neutrals = 4;
		String name, territory;
		String key1, key2, key3;
		int random = dice();
		// Declare our array of player/neutral colours
		String array[] = {"Magenta", "Cyan", "Dark Grey", "Plain Grey", "White", "Light Grey"};
		
		// Get our players names
		for (playerId=0; playerId<2; playerId++) {
			mapPanel.displayString("Enter the name of player " + (playerId+1));
			name = commandPanel.getCommand();
			mapPanel.displayString("> " + name);
			mapPanel.displayString("> (Player " + (playerId+1) + ") " + name + " will use " + array[playerId] + " as their colour\n");
		}
		
		// Make user enter a key to assign colours to our neutrals
		mapPanel.displayString("Enter any key to assign colours to neutrals \n");
	    key1 = commandPanel.getCommand();
	    
	    // Make sure key is entered and print neutrals colours
	    if(key1.length()>0) {
		for(int i=0; i<neutrals; i++) {
			mapPanel.displayString("> Neutral " + (i+1) + " will use " + array[(i+2)] + " as their colour");	
		}
	    }
	  
	    // Make user enter key to draw cards for players/neutrals
		mapPanel.displayString("\n Enter any key to draw players/neutrals territory cards...");
	    key2 = commandPanel.getCommand();
	    
	    // Assuming key is entered, display which territory cards the players and neutrals have drawn
	    if(key2.length()>0) {
	    	mapPanel.displayString("Player 1 has drawn  territory cards for: "
	    	+ "Alaska, Greenland, Ontario, Ukraine, Venezuela, Afghanistan, Irkutsk, Ural, E Australia \n");
	    	
	    	mapPanel.displayString("Player 2 has drawn territory cards for: "
	    	+ "Quebec, E United States, Great Britain, N Europe, Peru, India, Siberia, Yakutsk, New Guinea \n");
	    	
	    	mapPanel.displayString("Neutral 1 has drawn territory cards for:  "
	    	    	+ "NW Territory, W United States, Iceland, W Europe, Middle East, Kamchatka\n");
	    	
	    	mapPanel.displayString("Neutral 2 has drawn territory cards for:  "
	    	    	+ "Alberta, Central America, S Europe, Scandinavia, Siam, Japan\n");
	    	
	    	mapPanel.displayString("Neutral 3 has drawn territory cards for:"
	    	    	+ "Congo, S Africa, E Africa, Mongolia, Brazil, W Australia\n");
	    	
	    	mapPanel.displayString("Neutral 4 has drawn territory cards for: "
	    	    	+ "China, Indonesia, Madagascar, N Africa, Egypt, Argentina\n");
	    }
	    
	    
	    // Prompt user to enter key to roll a random dice to see which player goes first
	    mapPanel.displayString("Enter any key to roll dice to decide which player goes first (Highest roll goes first)");
	    key3 = commandPanel.getCommand();
	   
	    // Perform our dice roll using the dice function and inform the user of the player who will go first
	    if(key3.length()>0) {
	    	mapPanel.displayString("Performing dice roll...");	
	    	if(random == 1) mapPanel.displayString("> Player 1 will go first");
	    	else if(random == 2) mapPanel.displayString("> Player 2 will go first");
	    }
	    
	    // Prompt the player who rolled the higher die to enter their territory first
	    mapPanel.displayString("\nPlayer " + random + ", Please enter the name of the territory you would like to place units on first: ");
	    territory = commandPanel.getCommand();
		}
	  
	  
	  public void displayString (String string) {
			infoPanel.addText(string);
			return;
		}
	  
	  // Dice function to perform random dice roll and get the larger of two players rolls
	    public static int dice() {
	    int die1 = (int) (Math.random() * 6 * 1);
	    int die2 = (int) (Math.random() * 6 * 1);
	    int equalCase = (int) (Math.random() * 2 * 1);
        if(die1>die2) return 1;
        if(die1<die2) return 2;
        // If players rolls are equal, return a random player so the game is still fair
        else return equalCase;
	    }
}
