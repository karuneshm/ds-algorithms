package com.karunesh;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] intArray =  {20,35,-15,7,55,1,-22};

		selectionSort(intArray);
		
		display(intArray);
	}
	
	private static void selectionSort(int array[]) {
		
		for(int lastUnSortredIndex = array.length-1; lastUnSortredIndex>0; lastUnSortredIndex--) {
			
			int largest = 0;
			
			for(int i = 0; i<lastUnSortredIndex; i++) {
				if(array[i]>array[largest]) {
					largest = i;
				}			
			}
			
			swap(array,largest,lastUnSortredIndex);
			
		}
		
		
		
	}

	public static void swap(int [] array, int i, int j) {
		
		if(i == j ) {
			return;
		}
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
	}
	
	private static void display(int array[]) {
		for( int i = 0; i<array.length ;i++) {
			System.out.println(array[i]);
		}
	}

}
