import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RetailPriceCalculator extends JFrame {
	/*
	 * This program calculates the retail price of an item
	 */
	
	//Initialize the components needed
	private JPanel panel;
	private JLabel message;
	private JLabel message2;
	private JTextField wholeSale;
	private JTextField markup;
	private JButton calcButton;
	
	//Constructor that sets the size, title, etc
	public RetailPriceCalculator() {
		super("Retail Price Calculator");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		setVisible(true);
		
		
	}
	
	//Add the components to the window
	private void buildPanel() {
		message = new JLabel("Enter in the wholesale cost of the item");
		message2 = new JLabel("Enter in the markup percentage of the item");
		wholeSale = new JTextField(10);
		markup = new JTextField(10);
		calcButton = new JButton("Calculate");
		
		//When the calculate button gets clicked on calculate the retail price
		calcButton.addActionListener(new CalcButtonListener());
		
		panel = new JPanel();
		
		panel.add(message);
		panel.add(wholeSale);
		panel.add(message2);
		panel.add(markup);
		panel.add(calcButton);
	}
	
	//Calculates the retail price when the calculate button gets clicked on
	private class CalcButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//Take the information from the textfields and convert it to doubles
			String str1;
			String str2;
			double retailPrice;
			
			str1 = wholeSale.getText();
			str2 = markup.getText();
			
			//Now that the strings from the textfields are doubles calculate the whole sale cost and the markup percentage
			double wholeSaleCost = Double.parseDouble(str1);
			double markupPercentage = Double.parseDouble(str2);
			
			markupPercentage += 100;
			markupPercentage/=100;
			
			retailPrice = markupPercentage * wholeSaleCost;
			retailPrice = Math.round(retailPrice * 100.0)/100.0;
			
			String message = String.format("The retail price of the product is: $%4.2f", retailPrice);
			
			//Display results in a JOptionPane
			JOptionPane.showMessageDialog(null, message);
			
			
			
		}
		
	}
	
		//Start the program
		public static void main(String[] args) {
			new RetailPriceCalculator();
		}
	

}