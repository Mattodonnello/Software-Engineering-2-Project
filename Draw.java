import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Draw extends JPanel{
	
	  public void paint(Graphics g) {
		  // Set Colour of our writing to white to contrast our black background
		    g.setColor(Color.WHITE);
		    
		  // Draw rectangle around our info. about our continents
		    g.drawRect(25, 450, 140, 140);
		    
		    // Draw lines to connect adjacent countries in different continents
		    g.drawLine(325, 75, 393, 127); // Greenland and Iceland
		    g.drawLine(393, 137, 265, 161); // Quebec and Iceland
		    g.drawLine(278, 357, 440,393);  // Veneuela and N Africa
		    g.drawLine(675, 342, 555, 432); // India and East Africa
		    g.drawLine(278, 357, 265, 250); // Venezuela and Eastern US.
		    
		    
		    
		  }
}