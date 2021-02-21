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
		    g.drawLine(233,523,230,440);//Argentina to Peru
        	    g.drawLine(283,523,289,415);//Argentina to Brazil
        	    g.drawLine(240,426,289,415);//Peru to Brazil
        	    g.drawLine(289,415,243,372);//Brazil to Venezula
        	    g.drawLine(233,372,221,426);//Venezuela to Peru
        	    g.drawLine(213,370,140,310);//Venezuela to Central America
        	    g.drawLine(180,290,235,245);//Central America to E United States
        	    g.drawLine(200,245,180,240);//E United States to W United States
        	    g.drawLine(150,245,150,299);//W United States to Central America
        	    g.drawLine(150,220,130,154);//W United States to Alberta
        	    g.drawLine(125,155,55,110);//Alberta to Alaska
        	    g.drawLine(90,100,140,86);//Alaska to NW Territory
		    
		    
		    
		  }
}
