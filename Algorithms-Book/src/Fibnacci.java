
public class Fibnacci {

	public static void main(String[] args) {
		
		
		
		 System.out.println(fib(6));

//		for (int N = 0; N < 100; N++) {
//	         System.out.println(N + " " + fib(N));
//	   }

		
	}
	
	public static int fib(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		else return fib(n-1)+fib(n-2);
	}
	

	
}
