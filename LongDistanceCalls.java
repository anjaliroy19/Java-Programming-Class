import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class LongDistanceCalls extends JFrame {
	
	/*
	 * This program calculates the charges for long distance calls
	 */
	
	private final double DAYTIME = 0.07;
	private final double EVENING = 0.12;
	private final double OFFPEAK = 0.05;
	
	//Initialize the components needed
	JPanel panel;
	private JLabel label;
	private JRadioButton daytime;
	private JRadioButton evening;
	private JRadioButton offpeak;
	private JTextField tfDaytime;
	private ButtonGroup radioButtonGroup;
	
	//Constructor that sets the size, title, etc
	public LongDistanceCalls() {
		super("Long Distance Calls");
		
		setSize(600, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		setVisible(true);
	}
	
	//Adds the components to the GUI
	private void buildPanel() {
		label = new JLabel("Enter in the number of minutes of your call, then select a time that you made the call");
		daytime = new JRadioButton("Daytime call (6AM - 5:59 PM): $0.07");
		evening = new JRadioButton("Evening call (6PM -  11:59 PM): $0.12");
		offpeak = new JRadioButton("OffPeak call (12AM - 5:59 AM): $0.05");
		tfDaytime = new JTextField(10);
		
		radioButtonGroup = new ButtonGroup();
		radioButtonGroup.add(daytime);
		radioButtonGroup.add(evening);
		radioButtonGroup.add(offpeak);
		
		//When a radiobutton is clicked on calculate the cost depending on what button was clicked
		daytime.addActionListener(new CalcButtonListener());
		evening.addActionListener(new CalcButtonListener());
		offpeak.addActionListener(new CalcButtonListener());
		
		panel = new JPanel();
		
		panel.add(label);
		panel.add(tfDaytime);
		panel.add(daytime);
		panel.add(evening);
		panel.add(offpeak);
		
	}
	
	//If a radiobutton is selected then calculate the cost for that button selected
	private class CalcButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//Take the information from the textfield and convert it to a double
			String minutes = tfDaytime.getText();
			
			//With the String in the textfield converted into a double calculate the cost
			double doubleMinutes = Double.parseDouble(minutes);
			double cost = 0;
			
			if(e.getSource() == daytime) {
				cost = doubleMinutes * DAYTIME;
			}else if(e.getSource() == evening) {
				cost = doubleMinutes * EVENING;
			} else if(e.getSource() == offpeak) {
				cost = doubleMinutes * OFFPEAK;
			}
			
			cost = Math.round(cost * 100.0)/100.0;
			
			//Display the results in a JOptionPane
			String message = String.format("The total cost for your call is: $%4.2f", cost);
			JOptionPane.showMessageDialog(null, message);
		
			
			
			
		}
		
	}
	
		//Start the program
		public static void main(String[] args) {
			new LongDistanceCalls();
		}

}