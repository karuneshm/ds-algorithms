package com.karunesh;

public class ShellSort {

	public static void main(String[] args) {
		
		int[] intArray =  {20,35,-15,7,55,1,-22};

		//insertionSort(intArray);
		
       //display(intArray);
	
	}
	
	private static void insertionSort(int array[]) {
		
		for(int firstUnsortedIndex =1 ; firstUnsortedIndex < array.length ; firstUnsortedIndex++) {
			int newElement = array[firstUnsortedIndex];
			
			int i;
			for( i = firstUnsortedIndex; i>0 && array[i-1]>newElement; i--) {
				array[i] = array[i-1];
			}
			
			array[i] = newElement;
		}
		
		
	}

	public static void swap(int [] array, int i, int j) {}
	
	private static void display(int array[]) {
		for( int i = 0; i<array.length ;i++) {
			System.out.println(array[i]);
		}
	}
	
	

}
