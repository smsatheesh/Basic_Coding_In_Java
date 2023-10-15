import java.util.*;

class WeekDayNumber {
	
	static void printRespectiveDayOfWeek(int week) {
		
		String strOfWeek = "";
		switch(week) {
			case 1:
				strOfWeek = "Monday";
				break;
			case 2:
				strOfWeek = "Tuesday";
				break;
			case 3:
				strOfWeek = "Wednesday";
				break;
			case 4:
				strOfWeek = "Thursday";
				break;
			case 5:
				strOfWeek = "Friday";
				break;
			case 6:
				strOfWeek = "Saturday";
				break;
			case 7:
				strOfWeek = "Sunday";
				break;
			default:
				System.out.println("Enter numbers in between 1-7 !!");
				break;
 		}
		
		if(strOfWeek != "")
			System.out.println(strOfWeek);
	}
		
	
	public static void main(String[] args) {
		
    	Scanner getInp = new Scanner(System.in);
    	System.out.println("Week number respective day program? by SM Satheesh");
    	System.out.println("Enter week number ?");
    	int week = getInp.nextInt();
    	printRespectiveDayOfWeek(week); // switch case conditional execution
    	
    	getInp.close();
    }
}