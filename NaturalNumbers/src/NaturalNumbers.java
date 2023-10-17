import java.util.*;

class NaturalNumbers {

	static void printNaturalNumbers(int start, int end) {
		
		if(start > end) {
			
			for(int loop = start; loop >= end; loop--)
				System.out.print(loop + " ");
		} else if(start < end) {
			
			for(int loop = start; loop <= end; loop++)
				System.out.print(loop + " ");
		}
	}
	
	public static void main(String[] args) {
			
	    	Scanner getInp = new Scanner(System.in);
	    	System.out.println("Print 'n' natural numbers (ASC || DESC) program? by SM Satheesh");
	    	System.out.println("Enter start range ?");
	    	int start = getInp.nextInt();
	    	System.out.println("Enter end range");
	    	int end = getInp.nextInt();
	    	
	    	printNaturalNumbers(start, end);
	    	
	    	getInp.close();
    	}
}
