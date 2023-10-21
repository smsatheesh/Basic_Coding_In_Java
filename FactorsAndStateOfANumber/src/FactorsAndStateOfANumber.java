import java.util.*;

class FactorsAndStateOfANumber {

	static void printFactorsOfANumberAndItsState(int num) {
	
		if(num == 1)
			System.out.println("Enter number is " + num + " and has no factors");
		else if(num < 0)
			System.out.println("Enter number is " + num + " or less than 0");
		else {
			
			int count = 0;
			for(int loopItr = 2; loopItr <= num / 2; loopItr++) {
				
				if(num % loopItr == 0) {
					count++;
					System.out.print(loopItr + " ");
				}
			}
			
			if(count > 0)
				System.out.println("are the factors\n" + num + " is a non-prime number");
			else
				System.out.println(num + " is a prime number");
		}
	}
	
	public static void main(String[] args) {
		
    	Scanner getInp = new Scanner(System.in);
    	System.out.println("Enter number to print its factor ? ");
    	int num = getInp.nextInt();
    	
    	printFactorsOfANumberAndItsState(num);
    	
    	getInp.close();
    }
}