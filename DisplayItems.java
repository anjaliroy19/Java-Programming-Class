package Retail;

public class DisplayItems {

	public static void main(String[] args) throws InvalidUnitsException, InvalidPriceException {
		RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
		RetailItem item2 = new RetailItem("Designer Jeans", 20, 34.95);
		RetailItem item3 = new RetailItem("Shirt", 20, 24.95);
		
		System.out.printf("Item 1: %s\nUnits: %d\nPrice: %.2f\n"
				+ "", item1.getDescription(), item1.getUnitsOnHand(), item1.getPrice());
		System.out.printf("\nItem 2: %s\nUnits: %d\nPrice: %.2f\n"
				+ "", item2.getDescription(), item2.getUnitsOnHand(), item2.getPrice());
		System.out.printf("\nItem 3: %s\nUnits: %d\nPrice: %.2f\n"
				+ "", item3.getDescription(), item3.getUnitsOnHand(), item3.getPrice());
		
	}

}
