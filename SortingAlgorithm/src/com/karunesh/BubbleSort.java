package com.karunesh;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] intArray =  {20,35,-15,7,55,1,-22};

		bubbleSort(intArray);
		
		display(intArray);
	}
	
	private static void bubbleSort(int array[]) {
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0 ; j < array.length-1; j++) {
				if(array[j] > array[j+1]) {
					swap(array,j,j+1);
				} 
			}
		}
		
		
	}

	public static void swap(int [] array, int i, int j) {
		
		if(i== j ) {
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
