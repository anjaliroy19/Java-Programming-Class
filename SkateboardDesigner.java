import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class SkateboardDesigner extends JFrame {
	/*
	 * This program lets the user build skateboard then displays cost
	 */
	
	
	//Initialize the needed components
	JPanel panel = new JPanel();
	
	private JLabel title = new JLabel("Welcome to the skate shop please select your products");
	private JComboBox decks;
	private JComboBox truckAssembilies;
	private JComboBox wheels;
	
	private String[] deckList = {"The Master Thrasher ($60)","The Dictator ($45)","The Street King $50"};
	private String[] truckAssembiliesList = {"7.75-inch axel ($35)","8-inch axel ($40)","8.5-inch axel ($45)"};
	private String[] wheelsList = {"51 mm ($20)","55 mm ($22)","58 mm ($24)", "61 mm ($28)"};
	
	private JCheckBox gripTape = new JCheckBox("Grip Tape ($10)");
	private JCheckBox bearings = new JCheckBox("Bearings ($30)");
	private JCheckBox riserPads = new JCheckBox("Riser Pads ($2)");
	private JCheckBox nutsBolts = new JCheckBox("Nuts and Bolts ($3)");
	
	private JLabel subTotal = new JLabel("Subtoatal: $");
	private JLabel taxAmount = new JLabel("Amount of sales tax: $");
	private JLabel grandTotal = new JLabel("Grand Total: $");
	
	final double TAX = 0.06;
	double deckCost = 0;
	double truckAssemblyCost = 0;
	double wheelsCost = 0;
	double accessoriesCost = 0;
	
	//Constructor that sets the title,size and adds the components to the window
	public SkateboardDesigner() {
		super("Skateboard Designer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		decks = new JComboBox(deckList);
		decks.addActionListener(new ComboBoxListener());
		
		truckAssembilies = new JComboBox(truckAssembiliesList);
		truckAssembilies.addActionListener(new ComboBoxListener());
		
		wheels = new JComboBox(wheelsList);
		wheels.addActionListener(new ComboBoxListener());
		
		gripTape.addItemListener(new CheckBoxListener());
		bearings.addItemListener(new CheckBoxListener());
		riserPads.addItemListener(new CheckBoxListener());
		nutsBolts.addItemListener(new CheckBoxListener());
		
		
		
		add(panel);
		panel.add(title);
		panel.add(decks);
		panel.add(truckAssembilies);
		panel.add(wheels);
		panel.add(gripTape);
		panel.add(bearings);
		panel.add(riserPads);
		panel.add(nutsBolts);
		panel.add(subTotal);
		panel.add(taxAmount);
		panel.add(grandTotal);
		setVisible(true);
		setSize(1000,300);
		
	}
	
	//Determines which item from each combobox is selected so the cost can be determined
	private class ComboBoxListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			int selected = decks.getSelectedIndex();
			int selected2  = truckAssembilies.getSelectedIndex();
			int selected3 = wheels.getSelectedIndex();
			
			if(e.getSource() == decks && selected == 0) {
				deckCost = 60;
				String subTotalFormat = String.format("Subtotal: $%4.2f", (deckCost + truckAssemblyCost + wheelsCost + accessoriesCost));
				subTotal.setText(subTotalFormat);
				double tax = ((deckCost + truckAssemblyCost + wheelsCost + accessoriesCost) * TAX);
				tax = Math.round(tax * 100.0)/100.0;
				String taxFormat = String.format("Amount of sales tax: $%4.2f", tax);
				taxAmount.setText(taxFormat);
				String grandTotalFormat = String.format("Grand total: $%4.2f", (deckCost + truckAssemblyCost + wheelsCost + tax + accessoriesCost));
				grandTotal.setText(grandTotalFormat);
			}else if(e.getSource() == decks && selected == 1) {
				deckCost = 45;
				String subTotalFormat = String.format("Subtotal: $%4.2f", (deckCost + truckAssemblyCost + wheelsCost + accessoriesCost));
				subTotal.setText(subTotalFormat);
				double tax = ((deckCost + truckAssemblyCost + wheelsCost + accessoriesCost) * TAX);
				tax = Math.round(tax * 100.0)/100.0;
				String taxFormat = String.format("Amount of sales tax: $%4.2f", tax);
				taxAmount.setText(taxFormat);
				String grandTotalFormat = String.format("Grand total: $%4.2f", (deckCost + truckAssemblyCost + wheelsCost + tax + accessoriesCost));
				grandTotal.setText(grandTotalFormat);
			}else if(e.getSource() == decks && selected == 2) {
				deckCost = 50;
				String subTotalFormat = String.format("Subtotal: $%4.2f", (deckCost + truckAssemblyCost + wheelsCost + accessoriesCost));
				subTotal.setText(subTotalFormat);
				double tax = ((deckCost + truckAssemblyCost + wheelsCost + accessoriesCost) * TAX);
				tax = Math.round(tax * 100.0)/100.0;
				String taxFormat = String.format("Amount of sales tax: $%4.2f", tax);
				taxAmount.setText(taxFormat);
				String grandTotalFormat = String.format("Grand total: $%4.2f", (deckCost + truckAssemblyCost + wheelsCost + tax + accessoriesCost));
				grandTotal.setText(grandTotalFormat);
			}
			
			
			
			if(e.getSource() == truckAssembilies && selected2 == 0) {
				truckAssemblyCost = 35;
				String subTotalFormat = String.format("Subtotal: $%4.2f", (deckCost + truckAssemblyCost + wheelsCost + accessoriesCost));
				subTotal.setText(subTotalFormat);
				double tax = ((deckCost + truckAssemblyCost + wheelsCost + accessoriesCost) * TAX);
				tax = Math.round(tax * 100.0)/100.0;
				String taxFormat = String.format("Amount of sales tax: $%4.2f", tax);
				taxAmount.setText(taxFormat);
				String grandTotalFormat = String.format("Grand total: $%4.2f", (deckCost + truckAssemblyCost + wheelsCost + tax + accessoriesCost));
				grandTotal.setText(grandTotalFormat);
			}else if(e.getSource() == truckAssembilies && selected2 == 1) {
				truckAssemblyCost = 40;
				String subTotalFormat = String.format("Subtotal: $%4.2f", (deckCost + truckAssemblyCost + wheelsCost + accessoriesCost));
				subTotal.setText(subTotalFormat);
				double tax = ((deckCost + truckAssemblyCost + wheelsCost + accessoriesCost) * TAX);
				tax = Math.round(tax * 100.0)/100.0;
				String taxFormat = String.format("Amount of sales tax: $%4.2f", tax);
				taxAmount.setText(taxFormat);
				String grandTotalFormat = String.format("Grand total: $%4.2f", (deckCost + truckAssemblyCost + wheelsCost + tax + accessoriesCost));
				grandTotal.setText(grandTotalFormat);
			}else if(e.getSource() == truckAssembilies && selected2 == 2) {
				truckAssemblyCost = 45;
				String subTotalFormat = String.format("Subtotal: $%4.2f", (deckCost + truckAssemblyCost + wheelsCost + accessoriesCost));
				subTotal.setText(subTotalFormat);
				double tax = ((deckCost + truckAssemblyCost + wheelsCost + accessoriesCost) * TAX);
				tax = Math.round(tax * 100.0)/100.0;
				String taxFormat = String.format("Amount of sales tax: $%4.2f", tax);
				taxAmount.setText(taxFormat);
				String grandTotalFormat = String.format("Grand total: $%4.2f", (deckCost + truckAssemblyCost + wheelsCost + tax + accessoriesCost));
				grandTotal.setText(grandTotalFormat);
			}
			
			
			if(e.getSource() == wheels && selected3 == 0) {
				wheelsCost = 20;
				String subTotalFormat = String.format("Subtotal: $%4.2f", (deckCost + truckAssemblyCost + wheelsCost + accessoriesCost));
				subTotal.setText(subTotalFormat);
				double tax = ((deckCost + truckAssemblyCost + wheelsCost + accessoriesCost) * TAX);
				tax = Math.round(tax * 100.0)/100.0;
				String taxFormat = String.format("Amount of sales tax: $%4.2f", tax);
				taxAmount.setText(taxFormat);
				String grandTotalFormat = String.format("Grand total: $%4.2f", (deckCost + truckAssemblyCost + wheelsCost + tax + accessoriesCost));
				grandTotal.setText(grandTotalFormat);
			}else if(e.getSource() == wheels && selected3 == 1) {
				wheelsCost = 22;
				String subTotalFormat = String.format("Subtotal: $%4.2f", (deckCost + truckAssemblyCost + wheelsCost + accessoriesCost));
				subTotal.setText(subTotalFormat);
				double tax = ((deckCost + truckAssemblyCost + wheelsCost + accessoriesCost) * TAX);
				tax = Math.round(tax * 100.0)/100.0;
				String taxFormat = String.format("Amount of sales tax: $%4.2f", tax);
				taxAmount.setText(taxFormat);
				String grandTotalFormat = String.format("Grand total: $%4.2f", (deckCost + truckAssemblyCost + wheelsCost + tax + accessoriesCost));
				grandTotal.setText(grandTotalFormat);
			}else if(e.getSource() == wheels && selected3 == 2) {
				wheelsCost = 24;
				String subTotalFormat = String.format("Subtotal: $%4.2f", (deckCost + truckAssemblyCost + wheelsCost + accessoriesCost));
				subTotal.setText(subTotalFormat);
				double tax = ((deckCost + truckAssemblyCost + wheelsCost + accessoriesCost) * TAX);
				tax = Math.round(tax * 100.0)/100.0;
				String taxFormat = String.format("Amount of sales tax: $%4.2f", tax);
				taxAmount.setText(taxFormat);
				String grandTotalFormat = String.format("Grand total: $%4.2f", (deckCost + truckAssemblyCost + wheelsCost + tax + accessoriesCost));
				grandTotal.setText(grandTotalFormat);
			}else if(e.getSource() == wheels && selected3 == 3) {
				wheelsCost = 28;
				String subTotalFormat = String.format("Subtotal: $%4.2f", (deckCost + truckAssemblyCost + wheelsCost + accessoriesCost));
				subTotal.setText(subTotalFormat);
				double tax = ((deckCost + truckAssemblyCost + wheelsCost + accessoriesCost) * TAX);
				tax = Math.round(tax * 100.0)/100.0;
				String taxFormat = String.format("Amount of sales tax: $%4.2f", tax);
				taxAmount.setText(taxFormat);
				String grandTotalFormat = String.format("Grand total: $%4.2f", (deckCost + truckAssemblyCost + wheelsCost + tax + accessoriesCost));
				grandTotal.setText(grandTotalFormat);
			}
			
			
		}
		
	}
	
	//Determines which checkbox is selected so that the cost can be determined
	private class CheckBoxListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getSource() == gripTape) {
				if(gripTape.isSelected()) {
					accessoriesCost+=10;
					String subTotalFormat = String.format("Subtotal: $%4.2f", (deckCost + truckAssemblyCost + wheelsCost + accessoriesCost));
					subTotal.setText(subTotalFormat);
					double tax = ((deckCost + truckAssemblyCost + wheelsCost + accessoriesCost) * TAX);
					tax = Math.round(tax * 100.0)/100.0;
					String taxFormat = String.format("Amount of sales tax: $%4.2f", tax);
					taxAmount.setText(taxFormat);
					String grandTotalFormat = String.format("Grand total: $%4.2f", (deckCost + truckAssemblyCost + wheelsCost + tax + accessoriesCost));
					grandTotal.setText(grandTotalFormat);
				}else {
					accessoriesCost-=10;
					String subTotalFormat = String.format("Subtotal: $%4.2f", (deckCost + truckAssemblyCost + wheelsCost + accessoriesCost));
					subTotal.setText(subTotalFormat);
					double tax = ((deckCost + truckAssemblyCost + wheelsCost + accessoriesCost) * TAX);
					tax = Math.round(tax * 100.0)/100.0;
					String taxFormat = String.format("Amount of sales tax: $%4.2f", tax);
					taxAmount.setText(taxFormat);
					String grandTotalFormat = String.format("Grand total: $%4.2f", (deckCost + truckAssemblyCost + wheelsCost + tax + accessoriesCost));
					grandTotal.setText(grandTotalFormat);
				}
			}else if(e.getSource() == bearings) {
				if(bearings.isSelected()) {
					accessoriesCost+=30;
					String subTotalFormat = String.format("Subtotal: $%4.2f", (deckCost + truckAssemblyCost + wheelsCost + accessoriesCost));
					subTotal.setText(subTotalFormat);
					double tax = ((deckCost + truckAssemblyCost + wheelsCost + accessoriesCost) * TAX);
					tax = Math.round(tax * 100.0)/100.0;
					String taxFormat = String.format("Amount of sales tax: $%4.2f", tax);
					taxAmount.setText(taxFormat);
					String grandTotalFormat = String.format("Grand total: $%4.2f", (deckCost + truckAssemblyCost + wheelsCost + tax + accessoriesCost));
					grandTotal.setText(grandTotalFormat);
				}else {
					accessoriesCost-=30;
					String subTotalFormat = String.format("Subtotal: $%4.2f", (deckCost + truckAssemblyCost + wheelsCost + accessoriesCost));
					subTotal.setText(subTotalFormat);
					double tax = ((deckCost + truckAssemblyCost + wheelsCost + accessoriesCost) * TAX);
					tax = Math.round(tax * 100.0)/100.0;
					String taxFormat = String.format("Amount of sales tax: $%4.2f", tax);
					taxAmount.setText(taxFormat);
					String grandTotalFormat = String.format("Grand total: $%4.2f", (deckCost + truckAssemblyCost + wheelsCost + tax + accessoriesCost));
					grandTotal.setText(grandTotalFormat);
				}
			}else if(e.getSource() == riserPads) {
				if(riserPads.isSelected()) {
					accessoriesCost+=2;
					String subTotalFormat = String.format("Subtotal: $%4.2f", (deckCost + truckAssemblyCost + wheelsCost + accessoriesCost));
					subTotal.setText(subTotalFormat);
					double tax = ((deckCost + truckAssemblyCost + wheelsCost + accessoriesCost) * TAX);
					tax = Math.round(tax * 100.0)/100.0;
					String taxFormat = String.format("Amount of sales tax: $%4.2f", tax);
					taxAmount.setText(taxFormat);
					String grandTotalFormat = String.format("Grand total: $%4.2f", (deckCost + truckAssemblyCost + wheelsCost + tax + accessoriesCost));
					grandTotal.setText(grandTotalFormat);
				}else {
					accessoriesCost-=2;
					String subTotalFormat = String.format("Subtotal: $%4.2f", (deckCost + truckAssemblyCost + wheelsCost + accessoriesCost));
					subTotal.setText(subTotalFormat);
					double tax = ((deckCost + truckAssemblyCost + wheelsCost + accessoriesCost) * TAX);
					tax = Math.round(tax * 100.0)/100.0;
					String taxFormat = String.format("Amount of sales tax: $%4.2f", tax);
					taxAmount.setText(taxFormat);
					String grandTotalFormat = String.format("Grand total: $%4.2f", (deckCost + truckAssemblyCost + wheelsCost + tax + accessoriesCost));
					grandTotal.setText(grandTotalFormat);
				}
			}else if(e.getSource() == nutsBolts) {
				if(nutsBolts.isSelected()) {
					accessoriesCost+=3;
					String subTotalFormat = String.format("Subtotal: $%4.2f", (deckCost + truckAssemblyCost + wheelsCost + accessoriesCost));
					subTotal.setText(subTotalFormat);
					double tax = ((deckCost + truckAssemblyCost + wheelsCost + accessoriesCost) * TAX);
					tax = Math.round(tax * 100.0)/100.0;
					String taxFormat = String.format("Amount of sales tax: $%4.2f", tax);
					taxAmount.setText(taxFormat);
					String grandTotalFormat = String.format("Grand total: $%4.2f", (deckCost + truckAssemblyCost + wheelsCost + tax + accessoriesCost));
					grandTotal.setText(grandTotalFormat);
				}else {
					accessoriesCost-=3;
					String subTotalFormat = String.format("Subtotal: $%4.2f", (deckCost + truckAssemblyCost + wheelsCost + accessoriesCost));
					subTotal.setText(subTotalFormat);
					double tax = ((deckCost + truckAssemblyCost + wheelsCost + accessoriesCost) * TAX);
					tax = Math.round(tax * 100.0)/100.0;
					String taxFormat = String.format("Amount of sales tax: $%4.2f", tax);
					taxAmount.setText(taxFormat);
					String grandTotalFormat = String.format("Grand total: $%4.2f", (deckCost + truckAssemblyCost + wheelsCost + tax + accessoriesCost));
					grandTotal.setText(grandTotalFormat);
				}
			}
			
		}

		
		
	}
	
	//Start the program
	public static void main(String[] args) {
		new SkateboardDesigner();
	}

}