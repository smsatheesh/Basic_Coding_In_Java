import java.util.*;

class ArmStrongNumber {
	
	static boolean printIsArmStrongNumber(int num) {
	
		int armStrongSum = 0;
		int temp = num;
		
		while(num != 0) {
			int rem = num % 10;
			armStrongSum += (rem * rem * rem);
			num /= 10;
		}
		
		return (armStrongSum == temp);
	}
	
	public static void main(String[] args) {
		
    	Scanner getInp = new Scanner(System.in);
    	System.out.println("ArmStrong Number");
    	System.out.println("Enter number ? ");
    	int num = getInp.nextInt();
    	
    	boolean flag = printIsArmStrongNumber(num);
    	
    	if(flag)
    		System.out.println("Armstrong number " + num);
    	else
    		System.out.println("Not an armstrong number " + num);
    	
    	getInp.close();
    }
}