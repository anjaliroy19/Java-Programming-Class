import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MonthlySalesTax extends JFrame {
	/*
	 * This program calculates the state and county tax from the total amount of sales
	 */
	
	private final double STATETAX = 0.04;
	private final double COUNTYTAX = 0.02;
	
	//Initialize the components needed
	JPanel panel;
	private JLabel label;
	private JTextField tf;
	private JButton calc;
	
	//Constructor that sets the size, title, etc
	public MonthlySalesTax() {
		super("Monthly Sales Tax Calculator");
		
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		setVisible(true);
	}
	
	//Adds the components to the GUI
	private void buildPanel() {
		label = new JLabel("Enter in the Total Sales for the month");
		tf = new JTextField(10);
		calc = new JButton("Calculate");
		
		//When the calculate button is clicked on calculate the state and county tax
		calc.addActionListener(new CalcButtonListener());
		
		panel = new JPanel();
		
		panel.add(label);
		panel.add(tf);
		panel.add(calc);
		
	}
	
	//Calculates the state and county tax and displays it in a JOption Pane
	private class CalcButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//Take the information in the textfields and convert it doubles
			String str;
			double countySalesTax;
			double stateSalesTax;
			double combinedSalesTax;
			
			str = tf.getText();
			double sales = Double.parseDouble(str);
			
			//Now that values from the textfields are doubles caluclate the state and county tax
			countySalesTax =  sales * COUNTYTAX;
			countySalesTax = Math.round(countySalesTax * 100.0) / 100.0; 
			stateSalesTax = sales * STATETAX;
			stateSalesTax = Math.round(stateSalesTax * 100.0) / 100.0; 
			combinedSalesTax = countySalesTax + stateSalesTax;
			combinedSalesTax = Math.round(combinedSalesTax * 100.0) / 100.0; 
			
			//Display the results in a JOpationPane
		
			String message = String.format("The county sales tax is: $%4.2f" + "\n" + "The State sales tax is: $%4.2f" + "\n" +
			"The combined Sales tax is: $%4.2f", countySalesTax,stateSalesTax,combinedSalesTax);
			
			
			JOptionPane.showMessageDialog(null, message);
			
			
			
		}
		
	}
	
		//Start the program
		public static void main(String[] args) {
			new MonthlySalesTax();
		}

}