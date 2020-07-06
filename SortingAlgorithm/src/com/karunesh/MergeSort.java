package com.karunesh;

public class MergeSort {

	public static void main(String[] args) {
		
		int[] intArray =  {20,35,-15,7,55,1,-22};
		
		mergeSort(intArray, 0,  intArray.length);
		
		display(intArray);

		
	}
	
	public static void mergeSort(int [] input, int start, int end) {
		
		if(end - start < 2) {
			return;
		}
		
		int mid = (start+end)/2;
		
		mergeSort(input,start,mid);
		mergeSort(input, mid, end);
		merge(input,start,mid,end);
		
	}
	
	
	public static void merge(int [] input, int start, int mid, int end) {
		
		if(input[mid-1] <= input[mid]) {
			return;
		}
		
		int i = start;
		int j = mid;
		int tempIndex = 0;
		
		int temp [] = new int[end-start];
		
		while(i < mid && j<end) {
			temp[tempIndex++] = input[i] <= input[j]? input[i++] : input[j++];
		}
		
		System.arraycopy(input, i, input, start+tempIndex,mid-i);
		System.arraycopy(temp, 0, input, start, tempIndex);
		
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
