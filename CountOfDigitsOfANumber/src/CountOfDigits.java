import java.util.*;

class CountOfDigits {
	
	static void printCountOfDigits(int num) {
		
		int count = 0;
		while(num != 0) {
			count++;
			num /= 10;
		}
		
		System.out.println("Total digit count of a number is " + count);
	}
	
	public static void main(String[] args) {
		
	    	Scanner getInp = new Scanner(System.in);
	    	System.out.println("Count of digits of a number (ASC || DESC) program? by SM Satheesh");
	    	System.out.println("Enter number ?");
	    	int num = getInp.nextInt();
	    	
	    	printCountOfDigits(num);
	    	
	    	getInp.close();
   	}
}
