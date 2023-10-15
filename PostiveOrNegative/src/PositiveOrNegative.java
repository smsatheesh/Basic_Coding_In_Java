import java.util.*;

class PositiveOrNegative {
	
	static void checkIfPositiveOrNegativeUsingIfElse(int num) {
			
		System.out.println("If-Else Block => ");
		if(num > 0) {
			System.out.println(num + " is a positive number");
		} else if(num < 0) {
			System.out.println(num + " is a negative number");
		} else {
			System.out.println("Entered number is 0 !");
		}
	}
	
	static void checkIfPositiveOrNegativeUsingTernary(int num) {
			
		System.out.println("\nTernary Operator => ");
		if(num != 0) {
			String checkOf = (num > 0)? "positive": "negative";
			System.out.println(num + " is " + checkOf);
		} else {
			System.out.println("Entered number is 0 !");
		}
	}		
	
	public static void main(String[] args) {
		
    	Scanner getInp = new Scanner(System.in);
    	System.out.println("Positive or Negative program? by SM Satheesh");
    	int num = getInp.nextInt();
    	
    	checkIfPositiveOrNegativeUsingIfElse(num); // using if-else clause
    	checkIfPositiveOrNegativeUsingTernary(num); // using ternary operator
    	getInp.close();
    }
}