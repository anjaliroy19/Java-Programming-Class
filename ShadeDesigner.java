import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;



import javax.swing.JComboBox;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JTextField;





public class ShadeDesigner extends JFrame{

	

	/*

	 * This program lets the user designer a curtain and gets the total cost of it

	 */

	

	//Create all the necessary components

	private JLabel label = new JLabel("Please design a curtain from the choices provided");

	private JPanel panel = new JPanel();

	private JComboBox styles;

	private JComboBox sizes;

	private JComboBox colors;

	private String[] stylesList = {"Regular Shades ($0)","Folding Shades ($10)","Roman Shades ($15)",};

	private String[] sizesList = {"25 inches wide ($0)", "27 inches wide ($2)", "32 inches wide ($4)", "40 inches wide ($6)"};

	private String[] colorsList = {"Natural ($5)", "Blue ($0)","Teal($0)", "Red ($0)", "Green ($0)"};

	

	int stylesCost = 0;

	int sizesCost = 0;

	int colorsCost = 0;

	final int INITIALCOST = 50;

	

	private JLabel total = new JLabel("Your total cost is: ");

	private JLabel numOfShades = new JLabel("Number of shades to buy :");

	private JTextField numShades = new JTextField(5);

	

	//Constructor that adds everything to the window

	public ShadeDesigner() {

		super("Shade Designer");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		

		styles = new JComboBox(stylesList);

		sizes = new JComboBox(sizesList);

		colors = new JComboBox(colorsList);

		

		

		//When an item from the combobox is selected use the comboboxlistener to get the cost of that design option

		styles.addActionListener(new ComboBoxListener());

		sizes.addActionListener(new ComboBoxListener());

		colors.addActionListener(new ComboBoxListener());

		

		add(panel);

		panel.add(label);

		panel.add(styles);

		panel.add(sizes);

		panel.add(colors);

		panel.add(numOfShades);

		panel.add(numShades);

		



		panel.add(total);

		setSize(400,200);

		setVisible(true);

		

	}

	

	//Listener class to determine the cost of the choices selected

	private class ComboBoxListener implements ActionListener{



		@Override

		public void actionPerformed(ActionEvent e) {

			

			int selected = styles.getSelectedIndex();

			int selected2 = sizes.getSelectedIndex();

			int selected3 = colors.getSelectedIndex();

			String num = numShades.getText();

			int numShadesBuying = Integer.parseInt(num);

			

			

			if(e.getSource() == styles && selected == 0) {

					stylesCost = 0;

					total.setText("Your total cost is: $" + (stylesCost + sizesCost + colorsCost + INITIALCOST)*numShadesBuying);

			}else if(e.getSource() == styles && selected == 1) {

					stylesCost=10;

					total.setText("Your total cost is: $" + (stylesCost + sizesCost + colorsCost + INITIALCOST)*numShadesBuying);

			}else if(e.getSource() == styles && selected == 2) {

					stylesCost=15;

					total.setText("Your total cost is: $" + (stylesCost + sizesCost + colorsCost + INITIALCOST)*numShadesBuying);

			}

			

			

			if(e.getSource() == sizes && selected2 == 0) {

				sizesCost = 0;

				total.setText("Your total cost is: $" + (stylesCost + sizesCost + colorsCost + INITIALCOST)*numShadesBuying);

		}else if(e.getSource() == sizes && selected2 == 1) {

				sizesCost=2;

				total.setText("Your total cost is: $" + (stylesCost + sizesCost + colorsCost + INITIALCOST)*numShadesBuying);

		}else if(e.getSource() == sizes && selected2 == 2) {

				sizesCost=4;

				total.setText("Your total cost is: $" + (stylesCost + sizesCost + colorsCost + INITIALCOST)*numShadesBuying);

		}else if(e.getSource() == sizes && selected2 == 3) {

			sizesCost = 6;

			total.setText("Your total cost is: $" + (stylesCost + sizesCost + colorsCost + INITIALCOST)*numShadesBuying);

		}

			

			if(e.getSource() == colors && selected3 == 0) {

				colorsCost = 5;

				total.setText("Your total cost is: $" + (stylesCost + sizesCost + colorsCost + INITIALCOST)*numShadesBuying);

		}else if(e.getSource() == colors && selected3 == 1) {

				colorsCost=0;

				total.setText("Your total cost is: $" + (stylesCost + sizesCost + colorsCost + INITIALCOST)*numShadesBuying);

		}else if(e.getSource() == colors && selected3 == 2) {

				colorsCost=0;

				total.setText("Your total cost is: $" + (stylesCost + sizesCost + colorsCost + INITIALCOST)*numShadesBuying);

		}else if(e.getSource() == colors && selected3 == 3) {

			colorsCost=0;

			total.setText("Your total cost is: $" + (stylesCost + sizesCost + colorsCost + INITIALCOST)*numShadesBuying);

		}else if(e.getSource() == colors && selected3 == 4) {

			colorsCost=0;

			total.setText("Your total cost is: $" + (stylesCost + sizesCost + colorsCost + INITIALCOST)*numShadesBuying);

		}

		

	}

	





	}

	

	//Start the program

	public static void main(String[] args) {

		new ShadeDesigner();

	}

}
