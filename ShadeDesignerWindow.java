import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ShadeDesignerWindow extends JFrame {

	private JLabel label;
	private JPanel shadesPanel;
	private JComboBox shadesBox;
	private JPanel stylesPanel;
	private JComboBox stylesBox;
	private JPanel sizesPanel;
	private JComboBox sizesBox;
	private JPanel colorsPanel;
	private JComboBox colorsBox;
	private JPanel totalPanel;
	private JTextField total;
	
	private String[] shades = {""+1,""+2,""+3,""+4,""+5};
	double[]shrate = {1,2,3,4,};
	
	private String[] styles = {"Regular shades: Add$" + 0, "Folding shades: Add$" + 10, "Roman shades: Add$" + 15};
	double[]strate = {0,10,15};
	
	private String[] sizes = {"25 inches wide: Add$" + 0, "27 inches wide: Add$" + 2, "32 inches wide: Add$" + 4, "40 inches wide: Add$" + 6};
	double[] srate = {0,2,4,6};
	
	private String[] colors = {"Natural:Add$" + 5, "Blue:Add$" + 0, "Red:Add$" + 0, "Teal:Add$" + 0, "Green:Add$" + 0};
	double[] crate = {5,0,0,0,0};
	
	public ShadeDesignerWindow()
	{
		setTitle("Shade Designer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3,2));
		
		buildShadesPanel();
		buildShadesPanel();
		buildShadesPanel();
		buildShadesPanel();
		buildShadesPanel();
		
		add(shadesPanel);
		add(stylesPanel);
		add(sizesPanel);
		add(colorsPanel);
		add(totalPanel);
		pack();
		setVisible(true);
	}

	private void buildShadesPanel() {
		// TODO Auto-generated method stub
		label = new JLabel("Select number of shades.");
		shadesPanel = new JPanel();
		shadesBox = new JComboBox(shades);
		shadesBox.addActionListener(new ComboBoxListener());
		shadesPanel.add(label);
		shadesPanel.add(shadesBox);
	}
	
 }
