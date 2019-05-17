public class SumOfNumbers {
	//add all the numbers
	public static void main(String[] args) {

		System.out.println(totalOfNumbers(8));

	}
	public static int totalOfNumbers(int number){
		//begin with the number provided
	if(number >= 1){
		return(number + totalOfNumbers(number-1));
	}
	return 0;
}

}