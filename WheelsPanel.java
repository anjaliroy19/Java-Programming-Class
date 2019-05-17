import javax.swing.*;

import java.awt.*;

 

/**

    The WheelsPanel class allows the user to select different wheels.

*/

 

public class WheelsPanel extends JPanel

{

    // The following constants are used to indicate

    // The cost of wheels.

    public final double WHEEL1 = 20.0;

    public final double WHEEL2 = 22.00;

    public final double WHEEL3 = 24.00;

    public final double WHEEL4 = 28.00;

 

    private JRadioButton wheel1;        // To select wheel1.

    private JRadioButton wheel2;        // To select wheel2.

    private JRadioButton wheel3;        // To select wheel3.

    private JRadioButton wheel4;        // To select wheel4.

    private ButtonGroup bg;             // Radio button group

 

    /**

        Constructor

    */

 

    public WheelsPanel()

    {

        // Create a GridLayout manager with

        // four rows and one column.

        setLayout(new GridLayout(4, 1));

 

        // Create the radio buttons.

        wheel1 = new JRadioButton("51 mm", true);

        wheel2 = new JRadioButton("55 mm");

        wheel3 = new JRadioButton("58 mm");

        wheel4 = new JRadioButton("61 mm");

 

        // Group the redio buttons

        bg = new ButtonGroup();

        bg.add(wheel1);

        bg.add(wheel2);

        bg.add(wheel3);

        bg.add(wheel4);

         

        // Add a border around the panel.

        setBorder(BorderFactory.createTitledBorder("Wheels"));

         

        // Add the radio buttons to the panel.

       add(wheel1);

        add(wheel2);

        add(wheel3);

        add(wheel4);

    }  

 

}

