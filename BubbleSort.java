
public class BubbleSort {

/*
 *Given a random integer array.
 *Sort this array using insertion sort.
 */

	
/*
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements, 
 * if they are in wrong order.
 * The algorithm needs one whole pass without any swap to know it is sorted.
 */
	
	public static void bubbleSort(int input[]){
		
		for(int i = 0; i < input.length - 1; i++){
			for(int j = 0; j < input.length - i -1; j++ ){
				if(input[j] > input[j + 1]){
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
	
		int input[] = {8,2,6,1,5};
		bubbleSort(input);
		for(int i = 0; i < input.length; i++){
			System.out.print(input[i] + " ");
		}
		
	}

}
