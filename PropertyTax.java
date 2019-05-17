import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PropertyTax extends JFrame {
	/*
	 * This program calculates property tax from the given value of a property
	 */
	
	//Initialize the components needed
	JPanel panel;
	private JLabel label;
	private JTextField tf;
	private JButton calc;
	
	//Constuctor that sets the size, title, etc
	public PropertyTax() {
		super("Monthly Sales Tax Calculator");
		
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		setVisible(true);
	}
	
	//Adds the components to the window
	private void buildPanel() {
		label = new JLabel("Enter in the actual value of your property");
		tf = new JTextField(10);
		calc = new JButton("Calculate");
		
		//When the calculate button is clicked on calculate the property tax
		calc.addActionListener(new CalcButtonListener());
		
		panel = new JPanel();
		
		panel.add(label);
		panel.add(tf);
		panel.add(calc);
		
	}
	
	//Calculates the property tax when the calculate button gets clicked on
	private class CalcButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//Take the information from the textfield and convert it to a double
			String str;
			str = tf.getText();
			double valueOfProperty = Double.parseDouble(str);
			
			//Now that the string from the textfield is a double calculate the assessment value and property tax
			double assestmentValue = 0.6 * valueOfProperty;
			assestmentValue = Math.round(assestmentValue * 100.0)/100.0;
			double propertyTax = assestmentValue * 0.64;
			
			propertyTax/=100.0;
			propertyTax = Math.round(propertyTax * 100.0)/100.0;
			
			//Display results in a JOptionPane
			
			String message = String.format("The is assestment value for the property is: $%4.2f" +"\n" +
			"The property tax is: $%4.2f", assestmentValue,propertyTax);
			
			
			
			JOptionPane.showMessageDialog(null, message);
			
			
			
		}
		
	}
	
		//Start the program
		public static void main(String[] args) {
			new PropertyTax();
		}

}