package Retail;

@SuppressWarnings("serial")
public class InvalidUnitsException extends Exception{

	public InvalidUnitsException()
	{
		super("ERROR: UNITS IS NEGITIVE");
	}
	
}
