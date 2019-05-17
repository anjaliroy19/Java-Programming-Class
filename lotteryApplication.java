import java.util.Scanner;

public class lotteryApplication

{

    public static void main(String[] args) {

        Lottery lottery = new Lottery();

        int lotteryNumbersCount = lottery.getLotteryNumbers().length;



        System.out.println("Lottery Application\n");

        System.out.println("There are " + lotteryNumbersCount

                + " secret numbers in range of 0 through 9. "

                + "Try to guess them!!!\n");

 

        Scanner kb = new Scanner(System.in);

        int numbers[] = new int[lotteryNumbersCount];

 

        for (int i = 0; i < numbers.length; i++) {
        	
            System.out.print(String.format("Enter Number %d: ", i + 1));

            numbers[i] = kb.nextInt();

        }

 

        int match = lottery.compareNumbers(numbers);

         

       System.out.println("You entered: " + (numbers[1]));
       	//call lottery number
       
        if (match == lotteryNumbersCount) {

 

            System.out.println("\nWOHOO! ALL CORRECT! YOU WON THE BIG PRIZE!");

 

        } else {

 
        	
            System.out.println("\nUh-oh! You hit " + match + " number(s).");

 

        }

      
    }

}