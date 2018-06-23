
public class CheckSortedArray {
	 public static boolean CheckSorted(int input[], int startIndex) {
	    	if(startIndex >= input.length-1) {
	    		return true;
	    	}
	    	
	    	if(input[startIndex] > input[startIndex+1]) {
				return false;
				
			}
	    	boolean Ans = CheckSorted(input, startIndex+1);
	    	
	    	return Ans;
	    	
		
	    }

}
