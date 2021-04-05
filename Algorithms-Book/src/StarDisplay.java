
public class StarDisplay {

	public static void main(String[] args) {

		displayPyramid();

		
	}
	

	
//	public static void display() {
//		for(int i = 0; i<=4; i++) {
//			for(int j = 0; j<=i; j++) {
//					System.out.print("*");
//				
//			}
//			System.out.println();
//		}
//	}
	
//	public static void displayReverse() {
//		for(int i = 0; i<=4; i++) {
//			for(int j = 4; j>=i; j--) {
//					System.out.print("*");
//				
//			}
//			System.out.println();
//		}
//	}
	
//	public static void displayBoth() {
//		for(int i = 0; i<=4; i++) {
//			for(int j = 0; j<=i; j++) {
//					System.out.print("*");
//				
//			}
//			System.out.println();
//		}
//		
//
//		for(int i = 0; i<=4; i++) {
//			for(int j = 4; j>i; j--) {
//					System.out.print("*");
//				
//			}
//			System.out.println();
//		}
//	
//	}
	
	public static void displayFromOther() {
		for (int i = 0; i <=4; i++) {
			for (int j= 3; j>=i; j--) {
				System.out.print(" ");
			}
			
			for(int k = 0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void displayPyramid() {
		
		for(int i = 0; i <=4;i++) {
			for(int j=3; j>=i; j--) {
				System.out.print(" ");
			}
			
			for (int k = 0;k<=i;k++) {
				System.out.print(" *");
			}
			
			System.out.println();
		}
		
	}
		

}
