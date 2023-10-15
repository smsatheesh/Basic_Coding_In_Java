import java.util.*;

class GreatestOfTwoNumbers {

	static void maxOf2NumbersInConditional(int num1, int num2) {
		
		System.out.println("If-Else Block => ");
		if(num1 == num2) {
			System.out.println("Both are equal !");
		} else if(num1 > num2) {
			System.out.println(num1 + " is the greatest");
		} else {
			System.out.println(num2 + " is the greatest");
		}
	}
	
	static void maxOf2NumbersInTernary(int num1, int num2) {
		
		System.out.println("\nTernary Operator => ");
		if(num1 != num2) {
			int maxOf = (num1 > num2)? num1: num2;
			System.out.println(maxOf + " is the greatest");
		} else {
			System.out.println("Both are equal");
		}
	}
	
	    public static void main(String[] args) {
	
		Scanner getInp = new Scanner(System.in);
		System.out.println("Greatest of 2 numbers program? by SM Satheesh");
		int num1 = getInp.nextInt();
		int num2 = getInp.nextInt();
				
		maxOf2NumbersInConditional(num1, num2); // using if-else clause
		maxOf2NumbersInTernary(num1, num2); // using ternary operator
		getInp.close();
	    }
}
