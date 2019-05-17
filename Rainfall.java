import java.util.Scanner;

public class Rainfall {
	
	private double[] rainfall = new double[12];
	
	public Rainfall(double[] rainfall) {
		for(int i = 0; i < rainfall.length; i++) {
			this.rainfall[i] = rainfall[i];
		}
		
	}
	
	
	public double totalRainfall() {
		double total = 0;
		for(int i = 0; i < rainfall.length; i++) {
			total+=rainfall[i];
		}
		return total;
	}
	
	public double averageMonthlyRainfall() {
		double total = 0;
		for(int i = 0; i < rainfall.length; i++) {
			total+=rainfall[i];
		}
		
		total/=12;
		return Math.round(total* 100.0)/100.0;
	}
	
	public String monthWithMostRain() {
		
		int monthNum = 0;
		double greatestNum = 0;
		for(int i = 0; i < rainfall.length; i++) {
			if(rainfall[i] > greatestNum) {
				greatestNum = rainfall[i];
				monthNum = i;
			}
		}
		
		
		switch(monthNum + 1) {
			case 1: return "January"; 
			case 2: return "February"; 
			case 3: return "March";
			case 4: return "April";
			case 5: return "May";
			case 6: return "June";
			case 7: return "July";
			case 8: return "August";
			case 9: return "September";
			case 10: return "October";
			case 11: return "November";
			case 12: return "December";
		}
		return null;
		
	}
	
	public String monthWithLeastRain() {
		int monthNum = 0;
		double leastNum = rainfall[0];
		for(int i = 1; i < rainfall.length; i++) {
			if(rainfall[i] < leastNum) {
				leastNum = rainfall[i];
				monthNum = i;
			}
		}
		
		switch(monthNum + 1) {
			case 1: return "January"; 
			case 2: return "February"; 
			case 3: return "March";
			case 4: return "April";
			case 5: return "May";
			case 6: return "June";
			case 7: return "July";
			case 8: return "August";
			case 9: return "September";
			case 10: return "October";
			case 11: return "November";
			case 12: return "December";
		}
		return null;
		
	}
	
	public static void main(String[] args) {
		double[] rainfall = new double[12];
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the total rainfall for each month");
		
		for(int i = 0; i < 12; i++) {
			System.out.println(i+1 + ". ");
			double num = input.nextDouble();
			
			if(num <=-1) {
				System.out.println("Do not enter negative numbers");
				//enter in again for month
				
			}
			
			rainfall[i] = num;
		}
		
		Rainfall r = new Rainfall(rainfall);
		
		System.out.println("The total rainfall for the year is: " + r.totalRainfall() + " in");
		System.out.printf("The monthly average rainfall is: %4.2f" + " in" + "\n", r.averageMonthlyRainfall());
		System.out.println("The month with the most rainfall is: " + r.monthWithMostRain());
		System.out.println("The month with the least rainfall is: " + r.monthWithLeastRain());
		
		
	}

}
