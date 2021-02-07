import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RiskFrame extends javax.swing.JFrame implements ActionListener{

	// Use JSplitPane to split our window into two
    private final JSplitPane splitPane;  
    
    // Create our two panels
    private final JPanel myPanel = new JPanel();
    private final JPanel panel; 
    // Declare our two player name labels
    private static JLabel label;
	private static JLabel label2;
	// Declare our two labels for users to choose there player names
	private static JTextField usertext1;
	private static JTextField usertext2;
	// Declare our button to select names and allocate territories
	private static JButton button1;
	// Declare multiple success label variables that print if player names are adequate
	private static JLabel success;
	private static JLabel success2;
	private static JLabel success3;
	private static JLabel success4  ;
	private static JLabel success5  ;
	private static JLabel success6  ;
	

	public static void main(String[] args) {
	public RiskFrame(){
    	
    	
        splitPane = new JSplitPane();
        
        // Declare your Main class to access its components
        Draw s = new Draw();

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

	}

}
