import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class JoesAutomotive extends JFrame {
	/*
	 * This program creates a list of services provided at Joe's Automotive. Any services selected will be added towards the total cost
	 */
	
	//Total sum of the services selected
	int sum = 0;
	
	//Initialize all the checkboxes needed
	JPanel panel;
	private JLabel label;
	private JLabel total;
	private JCheckBox oilChange;
	private JCheckBox lubeJob;
	private JCheckBox radiatorFlush;
	private JCheckBox transmissionFlush;
	private JCheckBox inspection;
	private JCheckBox mufflerReplacement;
	private JCheckBox tireRotation;
	private JCheckBox otherServices;
	private JTextField otherServicesHours;
	private JLabel hours;
	
	//Constructor that sets the title,size,etc
	public JoesAutomotive() {
		super("Joe's Automotive");
		
		setSize(600, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		setVisible(true);
	}
	
	//Adds the check boxes and label and assigns each check box to a check box listener
	private void buildPanel() {
		label = new JLabel("Welcome to Joes Automotive please the select the services that your require today");
		total = new JLabel("Your Total is: ");
		oilChange = new JCheckBox("Oil Change: $26");
		oilChange.addItemListener(new CheckBoxListener());
		lubeJob = new JCheckBox("Lube Job: $18");
		lubeJob.addItemListener(new CheckBoxListener());
		radiatorFlush = new JCheckBox("Radiator Flush: $30");
		radiatorFlush.addItemListener(new CheckBoxListener());
		transmissionFlush = new JCheckBox("Transmission Flush: $80");
		transmissionFlush.addItemListener(new CheckBoxListener());
		inspection = new JCheckBox("Inspection: $15");
		inspection.addItemListener(new CheckBoxListener());
		mufflerReplacement = new JCheckBox("Muffler Replacement: $100");
		mufflerReplacement.addItemListener(new CheckBoxListener());
		tireRotation = new JCheckBox("Tire Rotation: $20");
		tireRotation.addItemListener(new CheckBoxListener());
		otherServices = new JCheckBox("Other non-routine services: $20");
		otherServices.addItemListener(new CheckBoxListener());
		otherServicesHours = new JTextField(5);
		hours = new JLabel("Enter in the number of hours non-routine services performed");
		JTextField hoursField = new JTextField(6);
		
		panel = new JPanel();
		
		panel.add(label);
		panel.add(oilChange);
		panel.add(lubeJob);
		panel.add(radiatorFlush);
		panel.add(transmissionFlush);
		panel.add(inspection);
		panel.add(mufflerReplacement);
		panel.add(tireRotation);
		panel.add(otherServices);
		panel.add(hours);
		panel.add(otherServicesHours);
		panel.add(total);
		
	}
	
	//If a check box is selected then add that cost to the users total else deduct it from the users total
	private class CheckBoxListener implements ItemListener{
		

		@Override
		public void itemStateChanged(ItemEvent e) {
			String hours = otherServicesHours.getText();
			double hrs = Double.parseDouble(hours);
			
			
			if(e.getSource() == oilChange) {
				if(oilChange.isSelected()) {
					sum+=26;
					total.setText("Your Total is: $" + sum);
				}else {
					sum-=26;
					total.setText("Your Total is: $" + sum);
				}
			}else if(e.getSource() == lubeJob) {
				if(lubeJob.isSelected()) {
					sum+=18;
					total.setText("Your Total is: $" + sum);
				}else {
					sum-=18;
					total.setText("Your Total is: $" + sum);
				}
			}else if(e.getSource() == radiatorFlush) {
				if(radiatorFlush.isSelected()) {
					sum+=30;
					total.setText("Your Total is: $" + sum);
				}else {
					sum-=30;
					total.setText("Your Total is: $" + sum);
				}
			}else if(e.getSource() == transmissionFlush) {
				if(transmissionFlush.isSelected()) {
					sum+= 80;
					total.setText("Your Total is: $" + sum);
				}else {
					sum-=80;
					total.setText("Your Total is: $" + sum);
				}
			}else if(e.getSource() == inspection) {
				if(inspection.isSelected()) {
					sum+= 15;
					total.setText("Your Total is: $" + sum);
					
				}else {
					sum-=15;
					total.setText("Your Total is: $" + sum);
				}
			}else if(e.getSource() == mufflerReplacement) {
				if(mufflerReplacement.isSelected()) {
					sum+= 100;
					total.setText("Your Total is: $" + sum);
				}else {
					sum-=100;
					total.setText("Your Total is: $" + sum);
				}
			}else if(e.getSource() == tireRotation) {
				if(tireRotation.isSelected()) {
					sum+=20;
					total.setText("Your Total is: $" + sum);
					
				}else {
					sum-=20;
					total.setText("Your Total is: $" + sum);
				}
			}else if(e.getSource() == otherServices) {
				if(otherServices.isSelected()) {
					sum+=20;
					total.setText("Your Total is: $" + (sum * hrs));
				}else {
					sum-=20;
					total.setText("Your Total is: $" + (sum * hrs));
				}
				 if(e.getSource() == total);
			}
			
		}
		
	}
	
	//Start the program
	public static void main(String[] args) {
		new JoesAutomotive();
	}
	
}