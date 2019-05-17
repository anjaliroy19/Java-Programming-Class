import java.text.DecimalFormat;



import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JSlider;

import javax.swing.JTextField;

import javax.swing.event.ChangeEvent;

import javax.swing.event.ChangeListener;



public class TaxCalculator  extends JFrame{

	/*

	 * This program lets the user enter in a cost for an item then displays the amount of sales tax for the

	 * percentage of sales tax that the user can select from 0% to 10%

	 */

	

	//Initialize the needed components

	private JLabel cost = new JLabel("Enter in cost of item: $");

	private JTextField costTextField = new JTextField(10);

	private JLabel salesTax = new JLabel("Sales Tax (%): ");

	private JTextField salesTaxField = new JTextField("0.0",10);

	private JLabel salesTaxCost = new JLabel("Sales tax amount: $");

	private JTextField salesTaxCostField = new JTextField("0.0",10);

	private JPanel panel = new JPanel();

	private JSlider slider = new JSlider(JSlider.HORIZONTAL,0,10,0);

	

	

	//Constructor that sets the size, title, etc. Components are added to the window through here

	public TaxCalculator() {

	super("Scrollable Tax Calculator");

	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	

	slider.setMajorTickSpacing(10);

	slider.setMinorTickSpacing(5);

	slider.setPaintTicks(true);

	slider.setPaintLabels(true);

	slider.addChangeListener(new SliderListener());

	

	

	salesTaxField.setEditable(false);

	salesTaxCostField.setEditable(false);

	

	add(panel);

	panel.add(cost);

	panel.add(costTextField);

	panel.add(salesTax);

	panel.add(salesTaxField);

	panel.add(salesTaxCost);

	panel.add(salesTaxCostField);

	panel.add(slider);

	setVisible(true);

	setSize(600,200);

	

	}

	

	//For whatever value the slider is on calculate the sales tax amount for it

	private class SliderListener implements ChangeListener{



	@Override

	public void stateChanged(ChangeEvent e) {

	//Take the value that the user entered in and convert it to a double for calculation purposes.

	double tax;

	double amountOfTax;

	String cost = costTextField.getText();

	double costOfItem = Double.parseDouble(cost);

	

	DecimalFormat df = new DecimalFormat("0.00");

	

	

	tax = slider.getValue();

	

	amountOfTax = costOfItem * (tax/100.0);

	

	salesTaxField.setText(Double.toString(tax));

	salesTaxCostField.setText(df.format(amountOfTax));

	

	

	

	}

	

	}

	

	//Start the program

	public static void main(String[] args) {

	new TaxCalculator();

	}

	



}