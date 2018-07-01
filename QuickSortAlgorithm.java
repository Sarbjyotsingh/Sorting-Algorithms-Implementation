

public class QuickSortAlgorithm {
	
	private static int partition(int[] input, int si,int ei) {
		int p = input[si];
		
		int count = 0;
		for(int i = si+1;i<= ei ;i++) {
			if(input[i]<=p) {
				count++;
			}
		}
		int pos = si+count;
		
		int temp = input[si];
		input[si] = input[pos];
		input[pos] = temp;
		
		
		int i = si;
		int j = ei;
		
		while(i<pos && j>pos) {
			
			while(input[i] <= input[pos] && i<pos) {
				i++;
			}
			while(input[j] > input[pos] && j>pos) {
				j--;
			}
			
			if(input[i] > input[pos] && input[j] <= input[pos]) {
				int k = input[i];
				input[i] = input[j];
				input[j] = k;
			}
			
		}
		
		return pos;
	} 
	
	private static void quickSort(int[] input, int si,int ei) {
		
		if(si >= ei) {
			return;
		}
		int pos =  partition(input, si,ei);
		
		quickSort(input, si, pos-1);
		quickSort(input, pos+1, ei);
		
	}
	
	public static void quickSort(int[] input) {
		
		quickSort(input, 0, input.length-1);
	}
	


}
