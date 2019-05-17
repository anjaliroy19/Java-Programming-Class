package Retail;

public class RetailItem {

	String description;
	int unitsOnHand;
	double price;
	
	public RetailItem(String description, int unitsOnHand, double price) throws InvalidUnitsException, InvalidPriceException
	{
		if (unitsOnHand < 0)
			throw new InvalidUnitsException();
		
		if (price < 0)
			throw new InvalidPriceException();
		
		
		
		this.description = description;
		this.unitsOnHand = unitsOnHand;
		this.price = price;
	}
	
	public String getDescription()
	{
		return description;
	}
	public int getUnitsOnHand()
	{
		return unitsOnHand;
	}
	public double getPrice()
	{
		return price;
	}
	
}