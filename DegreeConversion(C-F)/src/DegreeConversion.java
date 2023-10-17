import java.util.*;

class DegreeConversion {
	
	static void performPowerOperation(int deg, int opt) {
		
		int resultantDeg;
		switch(opt) {
			case 1: 
				resultantDeg = (deg * 9 / 5) + 32;
				break;
			case 2:
				resultantDeg = (deg - 32) * 5 / 9;
				break;
			default:
				System.out.println("Enter correct option !!");
				return;
		}
		System.out.println("Resultant degree is " + resultantDeg);
	}
	
	public static void main(String[] args) {
		
	    	Scanner getInp = new Scanner(System.in);
	    	System.out.println("Power of a number program? by SM Satheesh");
	    	System.out.println("Enter option ?");
	    	System.out.println("\n1. Celsius to Fahrenheit\n2. Fahrenheit to Celsius");
	    	int option = getInp.nextInt();
	    	System.out.println("Enter degree ?");
	    	int deg = getInp.nextInt();
	    	
	    	performPowerOperation(deg, option);
	    	
	    	getInp.close();
    	}
}
