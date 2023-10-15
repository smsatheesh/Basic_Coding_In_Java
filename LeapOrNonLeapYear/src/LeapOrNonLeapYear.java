import java.util.*;

class LeapOrNonLeapYear {
	
	static void checkIfYearIsLeapOrNonLeap(int year) {
			
		String result = (((year % 4) == 0) && ((year % 100) != 0)) ? "Leap Year": ((year % 400) == 0) ? "Leap Year": "Non-Leap Year";
		System.out.println(year + " is a " + result);
	}
		
	
	public static void main(String[] args) {
		
    	Scanner getInp = new Scanner(System.in);
    	System.out.println("Leap (or) Non-Leap year program? by SM Satheesh");
    	int year = getInp.nextInt();
    	
    	checkIfYearIsLeapOrNonLeap(year); // using ternary operator clause
    	getInp.close();
    }
}