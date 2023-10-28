import java.util.*;

class HCFandLCM {
	
	static int printHCF(int n1, int n2) {
		
		int hcf = 1;
		for(int i = 2; (i <= n1 || i <= n2); i++) {
			
			if(n1 % i == 0 && n2 % i == 0)
				hcf = i;
		}
		return hcf;
	}

	public static void main(String[] args) {
		
		Scanner getInp = new Scanner(System.in);
		System.out.print("Enter number 1 ::: ");
		int num1 = getInp.nextInt();
		System.out.print("Enter number 2 ::: ");
		int num2 = getInp.nextInt();
		
		int hcf = printHCF(num1, num2);
		System.out.println(hcf + " is the HCF of " + num1 + " and " + num2);
		
		int lcm = ((num1 * num2) / hcf);
		System.out.println(lcm + " is the LCM of " + num1 + " and " + num2);
	}
}