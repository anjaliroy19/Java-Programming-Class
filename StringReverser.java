public class StringReverser {
	
	public static void main(String[] args) {

		String i = "dog";

		flipString(i);

	}

	public static String flipString(String i){
		//take the last letter of string here
		String letter = i.substring(i.length() - 1, i.length());
		// need to subtract one from string
		String leaveString = i.substring(0,i.length() - 1);
		//print out a letter here
		System.out.print(letter);
	
		if(leaveString.length() != 0){
			return flipString(leaveString);

		}else {

			return null;

}
}

}