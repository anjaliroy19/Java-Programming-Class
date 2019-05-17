package Month;
import javax.swing.*;

import Month.Month.MonthsNameException;
import Month.Month.MonthsNumberException;

public class MonthDemo {

/**
 * @param args the command line arguments
 * @throws MonthsNumberException 
 * @throws MonthsNameException 
 */
public static void main(String[] args) throws MonthsNumberException, MonthsNameException {
    String response = JOptionPane.showInputDialog(null, "Please enter a month number");
    int mNumber = Integer.parseInt(response);

    Month m1 = new Month(mNumber);

    JOptionPane.showMessageDialog(null, m1.toString());

    response = JOptionPane.showInputDialog(null, "Please enter a month name");
    Month m2 = new Month(response);
    JOptionPane.showMessageDialog(null, m2.toString());

}
}
