
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class AddArmies {

	
	AddArmies(JPanel myPanel) {
		// Player 1 - Magenta
		JLabel army1 = new JLabel("1 army");
		JLabel army2 = new JLabel("1 army");
		JLabel army3 = new JLabel("1 army");
		JLabel army4 = new JLabel("1 army");
		JLabel army5 = new JLabel("1 army");
		JLabel army6 = new JLabel("1 army");
		JLabel army7 = new JLabel("1 army");
		JLabel army8 = new JLabel("1 army");
		JLabel army9 = new JLabel("1 army");
		 
		// Player 2  - Brown
		JLabel army10 = new JLabel("1 army");
		JLabel army11 = new JLabel("1 army");
		JLabel army12 = new JLabel("1 army");
		JLabel army13 = new JLabel("1 army");
		JLabel army14 = new JLabel("1 army");
		JLabel army15 = new JLabel("1 army");
		JLabel army16 = new JLabel("1 army");
		JLabel army17 = new JLabel("1 army");
		JLabel army18 = new JLabel("1 army");
		
		// Neutral 1 - Dark Grey
		JLabel army19 = new JLabel("1 army");
		JLabel army20 = new JLabel("1 army");
		JLabel army21 = new JLabel("1 army");
		JLabel army22 = new JLabel("1 army");
		JLabel army23 = new JLabel("1 army");
		JLabel army24 = new JLabel("1 army");
		
		// Neutral 2 - Cyan
		JLabel army25 = new JLabel("1 army");
		JLabel army26 = new JLabel("1 army");
		JLabel army27 = new JLabel("1 army");
		JLabel army28 = new JLabel("1 army");
		JLabel army29 = new JLabel("1 army");
		JLabel army30 = new JLabel("1 army");
		
		// Neutral 3 - White
		JLabel army31 = new JLabel("1 army");
		JLabel army32 = new JLabel("1 army");
		JLabel army33 = new JLabel("1 army");
		JLabel army34 = new JLabel("1 army");
		JLabel army35 = new JLabel("1 army");
		JLabel army36 = new JLabel("1 army");
		
		// Neutral 4 - Light Grey
		JLabel army37 = new JLabel("1 army");
		JLabel army38 = new JLabel("1 army");
		JLabel army39 = new JLabel("1 army");
		JLabel army40 = new JLabel("1 army");
		JLabel army41 = new JLabel("1 army");
		JLabel army42 = new JLabel("1 army");
		
		
		// Place 1 army in each of the player/neutral's territories
		
		// Player 1 Armies 
		army1.setLocation(191, 162); // Country 1
		myPanel.add(army1);
		army1.setForeground(Color.MAGENTA);
		army1.setSize(150, 15);
		 
        army2.setLocation(338, 73);   // Country 5
		myPanel.add(army2);
		army2.setForeground(Color.MAGENTA);
		army2.setSize(150, 15);
		
        army3.setLocation(45, 101);  // Country 9
		myPanel.add(army3);
		army3.setForeground(Color.MAGENTA);
		army3.setSize(150, 15);
		
        army4.setLocation(547, 192); // Country 13
		myPanel.add(army4);
		army4.setForeground(Color.MAGENTA);
		army4.setSize(150, 15);
		
		army5.setLocation(628, 239); // Country 17
		myPanel.add(army5);
		army5.setForeground(Color.MAGENTA);
		army5.setSize(150,15);
		
		army6.setLocation(645, 164); // Country 21
		myPanel.add(army6);
		army6.setForeground(Color.MAGENTA);
		army6.setSize(150,15); 
		
        army7.setLocation(750, 152); // Country 25
		myPanel.add(army7);
		army7.setForeground(Color.MAGENTA);
		army7.setSize(150,15); 
		
        army8.setLocation(889, 549); // Country 29
		myPanel.add(army8);
		army8.setForeground(Color.MAGENTA);
		army8.setSize(150,15); 
		
        army9.setLocation(213, 364); // Country 33
		myPanel.add(army9);
		army9.setForeground(Color.MAGENTA);
		army9.setSize(150,15); 
		
		
		// Player 2 Armies
		army10.setLocation(255, 173); // Country 2
		myPanel.add(army10);
		army10.setForeground(Color.CYAN);
		army10.setSize(150, 15);
		 
        army11.setLocation(205, 247);   // Country 6
		myPanel.add(army11);
		army11.setForeground(Color.CYAN);
		army11.setSize(150, 15);
		
        army12.setLocation(370, 211 );  // Country 10
		myPanel.add(army12);
		army12.setForeground(Color.CYAN);
		army12.setSize(150, 15);
		
        army13.setLocation( 460, 212); // Country 14
		myPanel.add(army13);
		army13.setForeground(Color.CYAN);
		army13.setSize(150, 15);
		
		army14.setLocation(679, 344 ); // Country 18
		myPanel.add(army14);
		army14.setForeground(Color.CYAN);
		army14.setSize(150,15);
		
		army15.setLocation(763, 82 ); // Country 22
		myPanel.add(army15);
		army15.setForeground(Color.CYAN);
		army15.setSize(150,15); 
		
        army16.setLocation(695, 120 ); // Country 26
		myPanel.add(army16);
		army16.setForeground(Color.CYAN);
		army16.setSize(150,15); 
		
        army17.setLocation(850, 441); // Country 30
		myPanel.add(army17);
		army17.setForeground(Color.CYAN);
		army17.setSize(150,15); 
		
        army18.setLocation(221, 438 ); // Country 34
		myPanel.add(army18);
		army18.setForeground(Color.CYAN);
		army18.setSize(150,15);
		
		
		
		// Neutral 1 
        army19.setLocation(146, 98); // Country 3
		myPanel.add(army19);
		army19.setForeground(Color.DARK_GRAY);
		army19.setSize(150, 15);
		
		army20.setLocation(135, 231); // Country 7
		myPanel.add(army20);
		army20.setForeground(Color.DARK_GRAY);
		army20.setSize(150,15);
		
		army21.setLocation(398, 292); // Country 11
		myPanel.add(army21);
		army21.setForeground(Color.DARK_GRAY);
		army21.setSize(150,15); 
		
        army22.setLocation(393, 139); // Country 15
		myPanel.add(army22);
		army22.setForeground(Color.DARK_GRAY);
		army22.setSize(150,15); 
		
        army23.setLocation(572, 350); // Country 19
		myPanel.add(army23);
		army23.setForeground(Color.DARK_GRAY);
		army23.setSize(150,15); 
		
        army24.setLocation(827, 106); // Country 23
		myPanel.add(army24);
		army24.setForeground(Color.DARK_GRAY);
		army24.setSize(150,15);
		
		
		
		// Neutral 2 
        army25.setLocation(123, 156); // Country 4
		myPanel.add(army25);
		army25.setForeground(Color.GRAY);
		army25.setSize(150, 15);
		
		army26.setLocation(140, 311); // Country 8
		myPanel.add(army26);
		army26.setForeground(Color.GRAY);
		army26.setSize(150,15);
		
		army27.setLocation(465, 282); // Country 12
		myPanel.add(army27);
		army27.setForeground(Color.GRAY);
		army27.setSize(150,15); 
		
        army28.setLocation(463, 134); // Country 16
		myPanel.add(army28);
		army28.setForeground(Color.GRAY);
		army28.setSize(150,15); 
		
        army29.setLocation(861, 225); // Country 20
		myPanel.add(army29);
		army29.setForeground(Color.GRAY);
		army29.setSize(150,15); 
		
        army30.setLocation(751, 372); // Country 24
		myPanel.add(army30);
		army30.setForeground(Color.GRAY);
		army30.setSize(150,15);
		
		
		
		// Neutral 3 
        army31.setLocation(760, 228); // Country 27
		myPanel.add(army31);
		army31.setForeground(Color.WHITE);
		army31.setSize(150, 15);
		
		army32.setLocation(813, 538); // Country 31
		myPanel.add(army32);
		army32.setForeground(Color.WHITE);
		army32.setSize(150,15);
		
		army33.setLocation(289, 427); // Country 35
		myPanel.add(army33);
		army33.setForeground(Color.WHITE);
		army33.setSize(150,15); 
		
        army34.setLocation(496, 474); // Country 37
		myPanel.add(army34);
		army34.setForeground(Color.WHITE);
		army34.setSize(150,15); 
		
        army35.setLocation(510, 544); // Country 39
		myPanel.add(army35);
		army35.setForeground(Color.WHITE);
		army35.setSize(150,15); 
		
        army36.setLocation(547, 444); // Country 41
		myPanel.add(army36);
		army36.setForeground(Color.WHITE);
		army36.setSize(150,15);
		
		
		
		// Neutral 4 
        army37.setLocation(735, 289); // Country 28
		myPanel.add(army37);
		army37.setForeground(Color.LIGHT_GRAY);
		army37.setSize(150, 15);
		
		army38.setLocation(771, 466); // Country 32
		myPanel.add(army38);
		army38.setForeground(Color.LIGHT_GRAY);
		army38.setSize(150,15);
		
		army39.setLocation(233, 535); // Country 36
		myPanel.add(army39);
		army39.setForeground(Color.LIGHT_GRAY);
		army39.setSize(150,15); 
		
        army40.setLocation(440,405); // Country 38
		myPanel.add(army40);
		army40.setForeground(Color.LIGHT_GRAY);
		army40.setSize(150,15); 
		
        army41.setLocation(499, 366); // Country 40
		myPanel.add(army41);
		army41.setForeground(Color.LIGHT_GRAY);
		army41.setSize(150,15); 
		
        army42.setLocation(586, 557); // Country 42
		myPanel.add(army42);
		army42.setForeground(Color.LIGHT_GRAY);
		army42.setSize(150,15);
		}
}
