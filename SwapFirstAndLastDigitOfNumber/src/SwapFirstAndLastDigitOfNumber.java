import java.util.*;
import java.lang.*;

class SwapFirstAndLastDigitOfNumber {
	
	static void printReverseOfFirstAndLastOfDigitsUsingString(int num) {
		
		String numStr = String.valueOf(num);
		StringBuilder strBuilder = new StringBuilder(numStr);
		String firstStrNum = String.valueOf(strBuilder.charAt(0));
		String lastStrNum = String.valueOf(strBuilder.charAt(strBuilder.length() - 1));
		strBuilder.replace(0, 1, lastStrNum);
		strBuilder.replace(strBuilder.length() - 1, strBuilder.length(), firstStrNum);
		System.out.println("String logic ans is " + strBuilder.toString());
	}
	
	static void printReverseOfFirstAndLastOfDigitsUsingMath(int num) {
		
//		pow() is used to find the power of a number.
//		log10() is used to find a log base 10 value of the passed parameter.
//		round() is used to round a number to the nearest integer
		
//		For instance, conside example 12345
		
		int lDigit = num % 10; 						// obtains lDigit = 5;
		int noOfDigits = (int) Math.log10(num);				// obtains noOfDigits = 4
		int fDigit = (int) (num / Math.pow(10, noOfDigits));  		// obtains fDigit = 1 ( 12345 / Math.pow( 10, 4 ))
		
		int resultant = lDigit;										// resultant = 5
		resultant = resultant * (int) Math.round(Math.pow(10, noOfDigits));				// resultant = 5 * (1000) = 50000
		resultant += num % (int) Math.round(Math.pow(10, noOfDigits));					// resultant = 5000 + (12345 % 1000) = 5000 + 2345 = 52345
		resultant -= (resultant % 10);									// resultant = 52345 - 5 = 52340
		resultant += fDigit;										// resultant = 52340 + 1 = 54321 which is ANS.
		
		System.out.println("Mathematical notation ans is " + resultant);
		
	}
	
	public static void main(String[] args) {
		
	    	Scanner getInp = new Scanner(System.in);
	    	System.out.println("Reverse of first and last digits of a number program? by SM Satheesh");
	    	System.out.println("Enter number ?");
	    	int num = getInp.nextInt();
	    	
	    	printReverseOfFirstAndLastOfDigitsUsingString(num); // using String concepts
	    	printReverseOfFirstAndLastOfDigitsUsingMath(num);
	    	
	    	getInp.close();
    	}
}
