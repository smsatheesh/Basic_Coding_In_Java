import java.util.*;
import java.lang.*;

class PowerOfANumber {
	
	static void performPowerOperation(int num, int pow) {
		
		int count = 1, temp = num;
		do {
			num *= temp;
			++count;
		}while(count < pow);
		
		System.out.println("Power of a " + temp + " using loop is " + num);
	}
	
	public static void main(String[] args) {
		
    	Scanner getInp = new Scanner(System.in);
    	System.out.println("Power of a number program? by SM Satheesh");
    	System.out.println("Enter base number ?");
    	int number = getInp.nextInt();
    	System.out.println("Enter power to the number " + number);
    	int power = getInp.nextInt();
    	
    	System.out.println("Power of a " + number +" using inbuilt function is " + (int)Math.floor(Math.pow(number, power)));
    	performPowerOperation(number, power);
    	
    	getInp.close();
    }
}