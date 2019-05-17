import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

 

/**

 * This class is an applet that draws a 4X4 Grid

 * and allows the user to draw or make a circle

 * disappear by clicking the mouse.

*/

public class JJM_GridFillerApplet extends JApplet

{

private int iGridRow, iGridCol;

private int iRow, iCol, X, Y;

private int iCurrentCol, iCurrentRow;

/**

 * init method

 */

public void init()

{

    //set the background of the content pane to white

    getContentPane().setBackground(Color.white);

    //create an instance of GridFiller

    GridFiller gridFiller = new GridFiller();

    //Add the gridFiller to the content pane

    setContentPane(gridFiller);

}//end init method

 

/**

 * An inner class that draws the 4X4 Grid

 */

public class GridFiller extends JPanel

{

    //Constructor

    GridFiller()

    {

        iGridRow = -1;

        //add a mouseListener

        addMouseListener(new MyMouseListener());

    }

 

    /**

     * paint method

     * @param g The applet's Graphics Object.

     */

    public void paint(Graphics g)

    {

        //call the superclass's paint method

        super.paint(g);

 

        //For Loop to draw rectangles

        for (iRow = 0; iRow < 4; iRow++)

        {

            for (iCol = 0; iCol < 4; iCol++)

            {

                X = iRow * 50;

                Y = iCol * 50;

                if ((iRow % 2) == (iCol % 2))

                {

                    g.setColor(Color.black);

                }

               else

                {

                    g.setColor(Color.white);

                }

                g.fillRect(X, Y, 50, 50);

            }//end inner for loop

        }//end outer for loop

 

        //if statement to draw a red circle

        if(iGridRow >= 0)

        {

            //set the color to red

            g.setColor(Color.red);

 

            //starting position

            X = iGridCol * 50;

            Y = iGridRow * 50;

 

            //fill a circle
           g.fillOval(X, Y, 50, 50);

        }//end if statement

    }//end paint method

}//end class GridFiller

 

/**

 * MyMouseListener inner class to handle the mouse click

 */

public class MyMouseListener extends MouseAdapter

{

    /**

     * MouseClicked method that draws a circle when the

     * mouse is clicked or makes the circle disappear

     * if there is already a circle drawn

    * @param e the Mouse event's object

    */

    public void mouseClicked(MouseEvent e)

    {

        //get the location of the mouse cursor

        iCurrentCol = e.getX() / 50;

        iCurrentRow = e.getY() / 50;

 

        //if statement to check if a square has a circle drawn in it

        if(iGridRow == iCurrentRow &&  iGridCol == iCurrentCol)

        {

            iGridRow = -1;

        }

        else

        {

            iGridRow = iCurrentRow;

            iGridCol = iCurrentCol;

        }

        repaint();

    }

}

}//end class GridFillerApplet

