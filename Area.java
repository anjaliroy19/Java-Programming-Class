public class Area {
	//  calculate the area of a circle
    public static double getArea(double radius) {
        return Math.PI * radius * radius;
    }

    //  calculate the area of rectangle 
    public static double getArea(int length, int width) {
        return length * width;
    }

   // calculate the area of cylinder
    public static double getArea(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

public static void main(String[] args) {

    // find area of a circle
    System.out.printf("The area of a circle with a " + "radius of 12.0 is %6.2f\n", Area.getArea(12.0));

    // find area of a rectangle
    System.out.printf("The area of a rectangle with a " + "length of 20 and a width of 25 is %6.2f\n",
            Area.getArea(20, 25));

    // find area of cylinder
    System.out.printf("The area of a cylinder with a " + "radius of 10.0 and a height " + "of 15.0 is %6.2f\n",
            Area.getArea(10.0, 15.0));
}
}