public class IsMemberMethod {
	
	//shows how many times an element will show
	public static void main(String[] args) {
		
		int[] array = {1,4,3,2};

		System.out.println(isMember(array,6));

	}

	public static boolean isMember(int[] array, int x){
		
		int[] leaveArray = new int[array.length - 1];

		for(int i =0; i < leaveArray.length; i++){

			leaveArray[i] = array[i];

		}

		if(array[array.length - 1] == x){
			return true;
			
		}else if(leaveArray.length == 0) {
			return false;
		}else {
			return isMember(leaveArray,x);
		}
	}

}