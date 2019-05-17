public class RecurisveMultipliction {
	
	//will use recursion
	public static void main(String[] args) {

		System.out.println(multiplication(7,4));

	}
	public static int multiplication(int k, int j){
		
		if(k > 0){

			return(j + multiplication(k-1,j));

		}else{

			return 0;

		}
}

}