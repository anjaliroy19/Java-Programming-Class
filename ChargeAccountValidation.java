import java.util.Scanner;

public class ChargeAccountValidation {
	
	private int[] accounts = {5658845,4520125,7895122,8777541,8451277,1302850,8080152,4562555,5552012,5050552,7825877,
	1250255,1005231,6545231,3852085,7576651,7881200,4581002};
	
	private int accountNumber;
	
	public ChargeAccountValidation(int accountNumber) {
		this.accountNumber = accountNumber;
		
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public boolean isValidAccountNumber(int accountNumber) {
		for(int i = 0; i < accounts.length; i++) {
			if(accountNumber == accounts[i]) {
				return true;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter in an account number");
		int userAccount = input.nextInt();
		
		ChargeAccountValidation cav = new ChargeAccountValidation(userAccount);
		
		if(cav.isValidAccountNumber(userAccount) == true) {
			System.out.println(userAccount + " is valid account number");
		}else {
			System.out.println(userAccount + " is an invalid account number");
		}
	}

}


