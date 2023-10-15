import java.util.*;

class MonthAndItsDays {
	
	public static void main(String[] args) {
		
	    	Scanner getInp = new Scanner(System.in);
	    	System.out.println("Week number respective day program? by SM Satheesh");
	    	System.out.println("Enter month number (1 - 12) ?");
	    	int mon = getInp.nextInt();
	
	    	if(mon > 0 && mon < 13) {
	    		
	    		String[] month = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
	        	System.out.print("The month is " + month[mon - 1]);
	        	
	        	if(mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon == 8 || mon == 10 || mon == 12)
	        		System.out.print(" and days are 31");
	        	else if(mon == 2)
	        		System.out.print(" and days are 28/29");
	        	else
	        		System.out.print(" and days are 30");
	    	} else {
	    		
	    		System.out.println("Kindly check the input (or) entered number !!");
	    	}
	    	
	    	getInp.close();
    	}
}
