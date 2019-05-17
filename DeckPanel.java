import javax.swing.*;

import javax.swing.event.*;

import java.awt.*;

 

/**

    The DeckPanel class allows the user to select either Master trasher, dictator, or street king.

*/

 

public class DeckPanel extends JPanel

{

    // The following constants are used to indicate

    // The different kind of decks

 
 

    private JPanel deckPanel;

    private JList deckList;

    private JList selectedDeckList;

     

    private String[] decks = {"The Master Trasher" , "The Dictator", "The Street King"};

     

    /**

        Constructor

    */

 

    public DeckPanel()

    {

        // Add a border around the panel.

        setBorder(BorderFactory.createTitledBorder("Decks"));

         

        // Create a GridLayout manager with

        // Two rows and one column

        setLayout(new GridLayout(3, 1));

 

    }

}

