import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Thermometer extends JApplet implements ChangeListener {

   private Container contentPane;
   private JPanel sliderPanel;
   private JPanel displayPanel;
   private JPanel titlePanel;

   private JSlider slider;
   private JLabel title;
   private JLabel tempLabel;
   private JTextField temp;

   public void init () {

	contentPane = getContentPane();
	contentPane.setLayout (new BorderLayout ());

	// set-up the panels and GUI objects

	titlePanel = new JPanel ();
	displayPanel = new JPanel ();
	sliderPanel = new JPanel ();

	title = new JLabel ("Move the slider to set-up the temperature");
	titlePanel.add(title);
	
	// create the slider object that resembles a thermometer

	slider = new JSlider (JSlider.VERTICAL, -50, 120, 70);
	slider.setMajorTickSpacing(10);
	slider.setMinorTickSpacing(5);
	slider.setPaintTicks(true);
	slider.setPaintLabels(true);

	// add ChangeListener to the slider object

	slider.addChangeListener (this);
	sliderPanel.add(slider);

	temp = new JTextField ("70", 2);
	
	temp.setEditable(false); // make the textbox uneditable
 	
	tempLabel = new JLabel ("Degrees Fahrenheit");

	
	displayPanel.add(temp);
	displayPanel.add(tempLabel);
	

	// add the panels to the contentPane

	contentPane.add(titlePanel, BorderLayout.NORTH);
	contentPane.add(sliderPanel, BorderLayout.CENTER);
	contentPane.add(displayPanel, BorderLayout.SOUTH);
   }

// implement the only method in the ChangeListener interface

   public void stateChanged (ChangeEvent e) {

	int temperature = slider.getValue();
	temp.setText(Integer.toString(temperature));
   }
}
