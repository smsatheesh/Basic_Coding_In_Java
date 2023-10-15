import java.util.*;

class PositiveOrNegative {
	static void checkEitherPosOrNegUsingIfElse(int num) {
		
		System.out.println("If-Else Block => ");
		if(num == 0) {
			System.out.println("Entered number is 0 !");
		} else if(num > 0) {
			System.out.println(num + " is positive");
		} else {
			System.out.println(num + " is negative");
		}
	}
	
	static void checkEitherPosOrNegUsingTernary(int num) {
		
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
    	System.out.println("Postive or Negative program? by SM Satheesh");
    	int num = getInp.nextInt();
    	
    	checkEitherPosOrNegUsingIfElse(num); // using if-else clause
    	checkEitherPosOrNegUsingTernary(num); // using ternary operator
    	getInp.close();
    }
}