import java.util.Scanner;

public class CharacterCounter {
	//count how many letters are in the string
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter in a word");

		String theWord = input.nextLine();

		System.out.println("Enter in a letter that you want to search for");

		String theLetter = input.nextLine();

		if(characterCount(theWord, theLetter) >=2 || characterCount( theWord, theLetter) == 0) {

			System.out.println("The letter " + theLetter + " was written " + characterCount(theWord,theLetter) + " times");

		}else {

			System.out.println("The letter " + theLetter + " was written " + characterCount(theWord,theLetter) + " time");

		}
	}

	public static int characterCount(String theWord, String theLetter){

		boolean end = false;

	String finalLetter = theWord.substring(theWord.length() - 1, theWord.length());

	String cut = theWord.substring(0,theWord.length()- 1);

	if(cut.length() ==0) {

		 end = true;

	}
			if(finalLetter.equals(theLetter) && end){
				return 1;

			}else if(finalLetter.equals(theLetter)) {

				return (1 + characterCount(cut,theLetter));

			}else if(end){

				return 0;

			}else{

				return (0+ characterCount(cut,theLetter));




			}
	}
}