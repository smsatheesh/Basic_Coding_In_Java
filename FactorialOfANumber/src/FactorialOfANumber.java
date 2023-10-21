import java.util.*;

class FactorialOfANumber {
	
	static void printFactorialOfANumberUsingIterative(int num) {
	
		int fact = 1;
		
		while(num != 0) {
			fact *= num;
			--num;
		}
		
		System.out.println("Iterative response is " + fact);
	}

	static int printFactorialOfANumberUsingRecursion(int num) {
		
		if(num < 1)
			return 1;
		else
			return num * printFactorialOfANumberUsingRecursion(num - 1);
	}
	
	public static void main(String[] args) {
		
    	Scanner getInp = new Scanner(System.in);
    	System.out.println("Enter number to print its factor ? ");
    	int num = getInp.nextInt();
    	
    	printFactorialOfANumberUsingIterative(num); // Iterative method
    	int recursiveResponse = printFactorialOfANumberUsingRecursion(num); // Recursively
    	System.out.println("Recursive response is " +recursiveResponse);
    	
    	getInp.close();
    }
}