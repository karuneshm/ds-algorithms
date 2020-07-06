package com.karunesh;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] intArray =  {20,35,-15,7,55,1,-22};
		
		quickSort(intArray,0, intArray.length);
		
		display(intArray);

		
	}
	
	public static void quickSort(int [] input , int start, int end) {
		if( end - start < 2) {
			return;
		}
		
		int pivotIndex = partition(input, start, end);
		quickSort(input, start, pivotIndex);
		quickSort(input, pivotIndex+1, end);
		
	}
	
	public static int partition(int[] input , int start, int end) {
		int pivot = input[start];
		int i = start;
		int j = end;
		
		while (i<j) {
			
			while (i<j && input[--j]>=pivot);
			if(i<j) {
				input[i] = input[j];
			}
			while (i<j && input[++i]<=pivot);	
			if(i<j) {
				input[j] = input[i];
			}
		}
		
		input [j] = pivot;
		return j;
	}
	
	
	private static int iterativeFactorial(int num) {
		if(num == 0) {
			return 1;
		}
		
		int factorial = 1;
		for(int i =1; i <= num; i++) {
			factorial = factorial * i;
		}
		
		return factorial;
	}
	
	private static int recurviseFactorial(int num) {
		
		if(num == 0 ) {
			return 1;
		} else {
			return  (num * recurviseFactorial(num-1));
		}
	}
	
	private static void display(int array[]) {
		for( int i = 0; i<array.length ;i++) {
			System.out.println(array[i]);
		}
	}
}
