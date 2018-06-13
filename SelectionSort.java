
public class SelectionSort {
	
	/*
	 *Given a random integer array.
	 *Sort this array using insertion sort.
	 */
	
	/*
	 * The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order)
	 * from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.
         *
         *  1) The subarray which is already sorted.
         *  2) Remaining subarray which is unsorted.
         *
         *  In every iteration of selection sort, the minimum element (considering ascending order) 
         *  from the unsorted subarray is picked and moved to the sorted subarray.
	 */
	public static void selectionSort(int input[]) {
		for(int i = 0;i<input.length-1;i++) {
			int min = input[i];
			int minindex = i;
			for(int j = i+1 ;j<input.length;j++) {
				if(min > input[j] ) {
					min = input[j];
					minindex = j;
				}
			}
			if(minindex!=i) {
			input[minindex] = input[i];
			 input[i]= min;
			}
		}
	}

	

}
