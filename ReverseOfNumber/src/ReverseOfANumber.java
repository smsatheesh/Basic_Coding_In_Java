import java.util.*;

class ReverseOfANumber{
	
	static void printReverseOfDigitsUsingString(int num) {
		
		String str = String.valueOf(num);
		StringBuilder result = new StringBuilder(str);
		result.reverse();
		Integer res = Integer.valueOf(result.toString());
		
		System.out.println("Reverse number using string logic is " + res);
	}
	
	static void printReverseOfDigitsUsingMath(int num) {
	
		int result = 0;
		while(num != 0) {
			
			result = (result * 10) + (num % 10);
			num /= 10;
		}
		
		System.out.println("Reverse number using math logic is " + result);
	}
	
	public static void main(String[] args) {
		
	    	Scanner getInp = new Scanner(System.in);
	    	System.out.println("Reverse of digits of a number program? by SM Satheesh");
	    	System.out.println("Enter number ?");
	    	int num = getInp.nextInt();
	    	
	    	printReverseOfDigitsUsingString(num); // using String concepts
	    	printReverseOfDigitsUsingMath(num);   // using math concepts
	    	
	    	getInp.close();
    	}
}
