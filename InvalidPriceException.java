package Retail;


@SuppressWarnings("serial")
public class InvalidPriceException extends Exception{

	public InvalidPriceException()
	{
		super("ERROR: PRICE IS NEGITIVE");
	}
	
}
