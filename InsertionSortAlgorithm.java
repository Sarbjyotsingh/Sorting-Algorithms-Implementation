
public class InsertionSortAlgorithm {
/*
 *Given a random integer array.
 *Sort this array using insertion sort.
 */

/*
 * Insertion sort iterates, consuming one input element each repetition, and growing a sorted output list.
 * At each iteration, insertion sort removes one element from the input data, 
 * finds the location it belongs within the sorted list, and inserts it there. 
 * It repeats until no input elements remain.
 */

	public static void insertionSort(int[] arr){
		//write your code here
                 int l = arr.length-1;
		for (int i = 0; i< l;i++) {
		 int temp = arr[i+1];
		 int j=i;
		   while(j>=0&& temp<arr[j]) {
			   arr[j+1] = arr[j];
			   j--;
		   }
		   arr[j+1] =temp;
		} 
		
	}

}
