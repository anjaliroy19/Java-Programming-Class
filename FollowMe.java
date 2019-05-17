import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JLabel;

public class FollowMe extends javax.swing.JApplet implements MouseMotionListener {
    //the word hello will appear
    private final JLabel lblHello = new JLabel("Hello");
   
    public void init() {
        // need to make sure the word is centered
        setLayout(new GridBagLayout());
        // add button
        add(lblHello);
      
        addMouseMotionListener(this);
        
    }
    // repaint 
    public void paint(Graphics k) {
        super.paint(k);
    }
   
    public void mouseDragged(MouseEvent m) {
    }
    // reset the label if it was never used
    public void mouseMoved(MouseEvent m) {
        lblHello.setLocation(m.getX() + 20, m.getY());
        repaint();
    } 

}
