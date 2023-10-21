import java.util.*;

class FibonacciSeries {
	
	static int n1 = 0, n2 = 1;
	static void printFibonacciSeriresUsingIterative(int num) {
	
		if(num >= 2) {

			int n1 = 0, n2 = 1;
			System.out.print(n1 + " " + n2 + " ");
			for(int i = 0; i < num - 2; i++) {
				
				int n3 = n1 + n2;
				n1 = n2;
				n2 = n3;
				System.out.print(n3 + " ");
			}
		} else if(num == 1)
			System.out.print(0);
	}
	
	static void printFibonacciSeriesUsingRecursion(int count) {
		
		if(count > 0) {
			int n3 = n2 + n1;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;
			printFibonacciSeriesUsingRecursion(count-1);
		}
	}
	
	public static void main(String[] args) {
		
	    	Scanner getInp = new Scanner(System.in);
	    	System.out.println("Fibonacci Series");
	    	System.out.println("Enter count to print ? ");
	    	int num = getInp.nextInt();
	    	
	    	System.out.println("Using Iteration ::: ");
	    	printFibonacciSeriresUsingIterative(num); // Iterative process
	    	System.out.println("\nUsing Recursion ::: ");
	    	System.out.print(n1+ " " + n2 + " ");
	    	printFibonacciSeriesUsingRecursion(num - 2);  // Recursive process
	    	
	    	getInp.close();
    	}
}
