import java.util.Scanner;

public class CarpetCalculator {
	public static void main(String[] args) {

	    final double CARPET_PRICE_PER_SQFT = 0;
 
	    Scanner keyboard = new Scanner(System.in);

	    System.out.println("This program will display the " + "carpet cost of a room." + "\nPlease enter the room's " + "dimension in feet.");

	    //  length of the room
	    System.out.print("Enter the length of room: ");
	    double length = keyboard.nextDouble();

	    //  width of the room
	    System.out.print("Enter the width of room: ");
	    double width = keyboard.nextDouble();
	    
	    System.out.print("Enter price per square foot of carpet: ");
	    double CARPET_PRICE_PER_SQFT1 = keyboard.nextDouble();
	    keyboard.close();

	    CarpetCalculator calculatorProgram = new CarpetCalculator();
	    RoomDimension dimensions = new RoomDimension(length, width);
	    RoomCarpet roomCarpet = new RoomCarpet(dimensions, CARPET_PRICE_PER_SQFT1);

	    System.out.println(roomCarpet);
	}
}
