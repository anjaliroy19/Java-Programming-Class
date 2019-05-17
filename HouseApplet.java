   import java.awt.*;
   import java.awt.event.*;
   import java.applet.*;

   public class HouseApplet extends Applet {    
  boolean leftWin, rightWin, door;

  public void init()      
  {      
     leftWin = false;
     rightWin = false;
     door = false;      

     setBackground(Color.white);       
     addMouseListener(new MyMouseListener());       
  }

  public void paint(Graphics g)
  {
     super.paint(g);

    // sketch out the house open
     g.setColor(Color.black);
     g.drawRect(100, 100, 200, 100);

    // sketch out the roof
     g.drawLine(80, 100, 320, 100);
     g.drawLine(80, 100, 200, 40);
     g.drawLine(200, 40, 320, 100);

    // sketch the left window open
     g.fillRect(120, 130, 40, 40);

    // sketch the right window open
     g.fillRect(240, 130, 40, 40);

    // sketch the door open
     g.fillRect(180, 130, 40, 70);          

     if (leftWin) {
        // sketch the left window closed
        g.setColor(Color.white);
        g.fillRect(120, 130, 40, 40);
        g.setColor(Color.black);
        g.drawRect(120, 130, 40, 40);
        g.drawLine(140, 130, 140, 170);
        g.drawLine(120, 150, 160, 150);

     }

     if (rightWin) {
        // sketch the right window closed
        g.setColor(Color.white);
        g.fillRect(240, 130, 40, 40);
        g.setColor(Color.black);
        g.drawRect(240, 130, 40, 40);
        g.drawLine(260, 130, 260, 170);
        g.drawLine(240, 150, 280, 150);

     }

     if (door) {
        // sketch the door closed
        g.setColor(Color.white);
        g.fillRect(180, 130, 40, 70);
        g.setColor(Color.black);
        g.drawRect(180, 130, 40, 70);
        g.fillOval(210, 165, 07, 07);

     }    
  }

  private class MyMouseListener implements MouseListener
  {
     public void mousePressed(MouseEvent e)
     {
     }

     public void mouseClicked(MouseEvent e)
     {
        int currentx = e.getX();
        int currenty = e.getY();

        boolean WindowLeft = (currentx >= 120 && currentx < 160 && currenty >= 130 && currenty <= 170);
        if (WindowLeft)
        {
           leftWin = true;
           repaint();               
        }

        boolean WindowRight = (currentx >= 240 && currentx < 280 && currenty >= 130 && currenty <= 170);
        if (WindowRight)
        {
           rightWin = true;
           repaint(); 
        }

        boolean Door = (currentx >= 180 && currentx < 220 && currenty >= 40 && currenty <= 200);
        if (Door)
        {            
           door = true;
           repaint();     
        }  

        else;  
     }

     public void mouseReleased(MouseEvent m)
     {
     }

     public void mouseEntered(MouseEvent m)
     {
     }

     public void mouseExited(MouseEvent m)
     {
     }
  }
   }
