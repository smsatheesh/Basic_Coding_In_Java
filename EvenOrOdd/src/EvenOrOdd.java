import java.util.*;

class EvenOrOdd {
	
	
	static void checkIfEvenOrOddUsingIfElse(int num) {
			
		System.out.println("If-Else Block => ");
		if((num % 2 == 0) && (num != 0)) {
			System.out.println(num + " is an even number ");
		} else if((num % 2 != 0) && (num != 0)) {
			System.out.println(num + " is an odd number");
		} else {
			System.out.println("Entered number is 0 !");
		}
	}
	
	static void checkIfEvenOrOddUsingTernary(int num) {
			
		System.out.println("\nTernary Operator => ");
		if(num != 0) {
			String checkOf = (num % 2 == 0)? "even": "odd";
			System.out.println(num + " is " + checkOf);
		} else {
			System.out.println("Entered number is 0 !");
		}
	}
		
	static void checkIfEvenOrOddWithoutUsingModulo(int num) {

		System.out.println("\nWithout using modulo operator");
		if(num > 0) {
			if(((num / 2) * 2) == num) {
				System.out.println(num + " is an even number");
			} else {
				System.out.println(num + " is an odd number");
			}
		} else {
			System.out.println("Entered number is 0 !");
		}
	}		
	
	public static void main(String[] args) {
		
	    	Scanner getInp = new Scanner(System.in);
	    	System.out.println("Even or Odd program? by SM Satheesh");
	    	int num = getInp.nextInt();
	    	
	    	checkIfEvenOrOddUsingIfElse(num); // using if-else clause
	    	checkIfEvenOrOddUsingTernary(num); // using ternary operator
	    	checkIfEvenOrOddWithoutUsingModulo(num); // without using modulo operator
	    	getInp.close();
    	}
}
