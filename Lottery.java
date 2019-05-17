import java.util.Random;
import java.util.Scanner;
 
class Lottery

{
    private int lotteryNumbers[];

    public Lottery() {

        Random rand = new Random(System.currentTimeMillis());

        lotteryNumbers = new int[5];

        for (int i = 0; i < lotteryNumbers.length; i++) {

            lotteryNumbers[i] = Math.abs(rand.nextInt()) % 10;

        }

    }
    public int compareNumbers(int[] usersNumbers) {

        int match = 0;

        if (usersNumbers.length == lotteryNumbers.length) {

            for (int i = 0; i < lotteryNumbers.length; i++) {

                if (usersNumbers[i] == lotteryNumbers[i]) {

                    match++;

                }

            }

        }

        return match;

    }

 

    public int[] getLotteryNumbers() {

        return lotteryNumbers;

    }





{
}


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

         

        if (match == lotteryNumbersCount) {

 

            System.out.println("\nWOHOO! ALL CORRECT! YOU WON THE BIG PRIZE!");

 

        } else {

 

            System.out.println("\nUh-oh! You hit " + match + " number(s).");

 

        }

 

    }

}

