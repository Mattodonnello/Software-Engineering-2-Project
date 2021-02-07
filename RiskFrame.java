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
		// TODO Auto-generated method stub

	}

}
