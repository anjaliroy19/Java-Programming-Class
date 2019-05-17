import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

import java.text.DecimalFormat;

 

/**

    The OrderCalculatorGUI class creates the GUI for the

    Brandi's Bagel House application.

*/

 

public class OrderCalculatorGUI extends JFrame

{

    private final int WINDOW_WIDTH = 400;               // window width

    private final int WINDOW_HEIGHT = 200;              // window height

    private DeckPanel decks;                                // Deck panel

    private AssembliesPanel assemblies;                 // Assemblies panel

    private WheelsPanel wheels;                         // Wheels panel

    private MiscellaneousPanel miscellaneous;           // To display a greeting

    private JPanel buttonPanel = new JPanel();      // To hold the buttons

    private JButton calcButton;                         // To calculate the cost

    private JButton exitButton;                         // To exit the application

    private final double TAX_RATE = 0.06;               // Sales tax rate

 

    public OrderCalculatorGUI()

    {

        // Display a title.

       setTitle("Skateboard Designer");

 

        // Specify an action for the close button.

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 

        // set size of the window

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

         

        // add gridlayout manager.

        setLayout(new GridLayout(3, 4));

 

        // Create the custom panels.

        miscellaneous = new MiscellaneousPanel();

        decks = new DeckPanel();

        assemblies = new AssembliesPanel();

        wheels = new WheelsPanel();

 
        // Create the button panel.

        buildButtonPanel();

 
       // Add the components to the content pane.

       add(decks);

        add(assemblies);

        add(wheels);

        add(miscellaneous);

        add(buttonPanel);

 

        // Pack the contents of the window and display it.

        pack();

        setVisible(true);

   }

 

/**

    The buildButtonPanel method builds the button panel.

*/

 

private void buildButtonPanel()

{

    // Create a panel for the buttons.

    calcButton = new JButton("Calculate");

    exitButton = new JButton("Exit");

 

    /** Register the action listeners.

    calcButton.addActionListener(new CalcButtonListener());

    exitButton.addActionListener(new ExitButtonListener());

    */



    // Add the buttons to the button panel.

    buttonPanel.add(calcButton);

    buttonPanel.add(exitButton);

}

 



    /**

        Private inner class that handles the event when

        the user clicks the Exit button.

   **/

 

    private class ExitButtonListener implements ActionListener

    {

        public void actionPerformed(ActionEvent e)

        {

           System.exit(0);

        }

    }

}

