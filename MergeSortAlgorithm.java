import java.util.Scanner;

public class MergeSortAlgorithm {
	
	 private static void merge(int[] input , int s,int m , int e){
		int size1 = (m-s)+1;
		int size2 = (e-m);
		
		int arr1[] = new int[size1];
		int arr2[] = new int[size2];
		
		for(int i = 0;i<size1;i++) {
			arr1[i] = input[s+i];
		}
		
		for(int i = 0; i < size2 ; i++) {
			arr2[i] = input[m+i+1];
		}
		
		int k = s;
		
		int i = 0 ; 
		int j =0;
		
		
		while(i<size1 && j<size2) {
			if(arr1[i]<=arr2[j]) {
				input[k] = arr1[i];
				i++;
			}else {
				input[k] = arr2[j];
				j++;
			}
			k++;			
		}
		

		while( i<size1) {
			input[k] = arr1[i];
			i++;
			k++;
		}
		while( j<size2) {
			input[k] = arr2[j];
			j++;
			k++;
		}
		
		
		
	}
	
	private static void mergeSort(int[] input,int s, int e) {
		if(s>=e) {
			return;
		}
		
		int m = (s+e)/2;
		
		mergeSort(input, s, m);
		mergeSort(input, m+1, e);
		
		merge(input, s, m, e);
		
		
	}
	
	public static void mergeSort(int[] input){
		// Write your code here
		   mergeSort(input, 0, input.length-1);
	}		
	
}
