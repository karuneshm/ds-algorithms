import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		int a[] = {-8,9,14,9,12,6,8};
		
		Arrays.sort(a);
		
		for(int i = 0 ; i<a.length ;i++) {
			System.out.print(a[i]+",");
			
		}
		
		
		int key = 45;
		System.out.println();
		System.out.println("The Element "+key+ " found at Position " + recursiveBinarySearch(key, a));
		
	}
	
	public static int binarySearch(int key, int a[]) {
		int low = 0;
		int high = a.length-1;
		
		while(low <= high) {
			int mid = low + (high - low)/2;
			
			if(key < a[mid]) 
				high = mid -1;
			else if(key > a[mid]) 
				low = mid +1;
			else return mid;
		}
		
		return -1;
	}
	
	public static int recursiveBinarySearch(int key, int a[]) {
		return recursiveBinarySearch(key, a, 0, a.length-1);
	}
	
	public static int recursiveBinarySearch(int key, int a[], int low, int high) {
		if(low>high) return -1;
		int mid = low + (high-low)/2;
		if(key < a[mid])
			return recursiveBinarySearch(key, a, low, mid-1);
		else if(key > a[mid])
			return recursiveBinarySearch(key, a, mid+1, high);
		else 
			return mid;
	}

}
