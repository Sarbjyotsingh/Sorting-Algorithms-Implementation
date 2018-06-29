
public class CheckSortedArray {
	 
private static boolean CheckSortedMain(int input[], int startIndex) {
    	if(startIndex >= input.length-1) {
    		return true;
    	}
    	
    	if(input[startIndex] > input[startIndex+1]) {
			return false;
			
		}
    	boolean Ans = CheckSortedMain(input, startIndex+1);
    	
    	return Ans;
    	
	
    }
public static boolean CheckSorted(int input[]) {
	    CheckSortedMain(input,0);

}
