import java.util.*;

class GreatestOfThreeNumbers{

	static void maxOf3Numbers(int num1, int num2, int num3) {
		
		if((num1 == num2) && (num2 == num3) && (num3 == num1)) {
			System.out.println("All are equal !");
		} else if((num1 > num2) && (num1 > num3)) {
			System.out.println(num1 + " is the greatest");
		} else if((num2 > num1) && (num2 > num3)) {
			System.out.println(num2 + " is the greatest");
		} else {
			System.out.println(num3 + " is the greatest");
		}
	}
	
	public static void main(String[] args) {

	    	Scanner getInp = new Scanner(System.in);
	    	System.out.println("Greatest of 3 numbers program? by SM Satheesh");
	    	int num1 = getInp.nextInt();
	    	int num2 = getInp.nextInt();
	    	int num3 = getInp.nextInt();
	    	
	    	maxOf3Numbers(num1, num2, num3);
	    	getInp.close();
	}
}
