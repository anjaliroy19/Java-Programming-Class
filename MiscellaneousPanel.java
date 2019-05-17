import javax.swing.*;

import java.awt.*;

/**

    The MiscellaneousPanel class allows the user to select miscellaneous items.

*/

 

public class MiscellaneousPanel extends JPanel

{

    // The following constants are used to indicate

    // The cost of miscellaneous items.

    public final double TAPE = 10.0;

    public final double BEARINGS = 30.00;

    public final double PADS = 2.00;

    public final double NUTS = 28.00;

 

    private JRadioButton tape;          // To select tape.

    private JRadioButton bearings;  // To select bearings.

    private JRadioButton pads;          // To select pads.

    private JRadioButton nuts;          // To select nuts.

    private ButtonGroup bg;             // Radio button group

 

    /**

        Constructor

    */

 

    public MiscellaneousPanel()

   {

        // Create a GridLayout manager with

        // four rows and one column.

        setLayout(new GridLayout(4, 1));

 

        // Create the radio buttons.

        tape = new JRadioButton("Grip Tape", true);

        bearings = new JRadioButton("Bearings");

        pads = new JRadioButton("Riser Pads");

        nuts = new JRadioButton("Nuts & Bolts Kit");

 

        // Group the redio buttons

        bg = new ButtonGroup();

        bg.add(tape);

        bg.add(bearings);

        bg.add(pads);

        bg.add(nuts);

         

        // Add a border around the panel.

        setBorder(BorderFactory.createTitledBorder("Miscellaneous Products"));

         

        // Add the radio buttons to the panel.

        add(tape);

        add(bearings);

        add(pads);

        add(nuts);

    }  

}
