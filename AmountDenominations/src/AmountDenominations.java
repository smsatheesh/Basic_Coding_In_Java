import java.util.*;

class AmountDenominations {

	static int rs2k, rs500, rs200, rs100, rs50, rs20, rs10, rs5, rs2, rs1, amtClone;
	
	static void checkDenominations(int amt) {

		while(amt != 0) {
			
			if(amt / 2000 != 0) {
				rs2k = amt / 2000; amt %= 2000;
			} else if(amt / 500 != 0) {
				rs500 = amt / 500; amt %= 500;
			} else if(amt / 200 != 0) {
				rs200 = amt / 200; amt %= 200;
			} else if(amt / 100 != 0) {
				rs100 = amt / 100; amt %= 100;
			} else if(amt / 50 != 0) {
				rs50 = amt / 50; amt %= 50; 
			} else if(amt / 20 != 0) {
				rs20 = amt / 20; amt %= 20;
			} else if(amt / 10 != 0) {
				rs10 = amt / 10; amt %= 10;
			} else if(amt / 5 != 0) {
				rs5 = amt / 5; amt %= 5;
			} else if(amt / 2 != 0) {
				rs2 = amt / 2; amt %= 2;
			} else {
				rs1 = amt / 1; amt %= 1;
			}
		}
		
		printDenominations();
	}
		
	static void printDenominations() {
		
		System.out.println(" -------------- DENOMINATIONS ---------------- ");
		System.out.println("2000      * " + rs2k + " = " + (rs2k * 2000));
		System.out.println(" 500      * " + rs500 + " = " + (rs500 * 500));
		System.out.println(" 200      * " + rs200 + " = " + (rs200 * 200));
		System.out.println(" 100      * " + rs100 + " = " + (rs100 * 100));
		System.out.println("  50      * " + rs50 + " = " + (rs50 * 50));
		System.out.println("  10      * " + rs10 + " = " + (rs10 * 10));
		System.out.println("   5      * " + rs5 + " = " + (rs5 * 5));
		System.out.println("   2      * " + rs2 + " = " + (rs2 * 2));
		System.out.println("   1      * " + rs1 + " = " + (rs1 * 1));
		System.out.println(" --------------------------------------------- ");
		System.out.println("        TOTAL = " + amtClone);
	}
	
	public static void main(String[] args) {
		
	    	Scanner getInp = new Scanner(System.in);
	    	System.out.println("Amount denomination program? by SM Satheesh");
	    	System.out.println("Enter amount ?");
	    	int amount = getInp.nextInt();
	    	amtClone = amount;
	    	checkDenominations(amount);
	    	
	    	getInp.close();
    	}
}
