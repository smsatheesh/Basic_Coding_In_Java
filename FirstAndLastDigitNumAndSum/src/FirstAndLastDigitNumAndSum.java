import java.util.*;

class FirstAndLastDigitNumAndSum {
	
	static void printOfDigits(int num) {
		
		int count = 0;
		int tempLast = num % 10;
		int tempFirst = num;
		while(num != 0) {
			count++;
			tempFirst = num % 10;
			num /= 10;
		}
		
		if(count > 1) {
			System.out.println("First digit is " + tempFirst + " and last digit is " + tempLast + "\nRespective sum is " + (tempFirst + tempLast));
		} else {
			System.out.println("Enter number is single digit and its value " + tempFirst);
		}
		
	}
	
	public static void main(String[] args) {
		
    	Scanner getInp = new Scanner(System.in);
    	System.out.println("First and last digits of a number and its sum program? by SM Satheesh");
    	System.out.println("Enter number ?");
    	int num = getInp.nextInt();
    	
    	printOfDigits(num);
    	
    	getInp.close();
    }
}