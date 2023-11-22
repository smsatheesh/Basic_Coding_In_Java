import java.util.*;

class PrintDaysInInputtedYearAndMonth {
		
	static boolean isLeapYear( int year ) {
		
		if( (( year % 4 ) == 0) && (( year % 100 ) != 0) )
			return true;
		else if( ((year % 400) == 0) )
			return true;
		else
			return false;
	}
	
	static void printDaysFromMonth( int month, int year ) {
		
		if( month >= 1 && month <= 12 ) {
			
			String[] arrMonth = new String[12];
			arrMonth[0] = "Jan"; arrMonth[1] = "Feb"; arrMonth[2] = "March"; arrMonth[3] = "April";
			arrMonth[4] = "May"; arrMonth[5] = "Jun"; arrMonth[6] = "Jul"; arrMonth[7] = "Aug";
			arrMonth[8] = "Sep"; arrMonth[9] = "Oct"; arrMonth[10] = "Nov"; arrMonth[11] = "Dec";
			
			System.out.print( arrMonth[month - 1] );
			
			switch( month ) {
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					System.out.println( " has of 31 days" );
					break;
				case 4: case 6: case 9: case 11:
					System.out.println( " has of 30 days" );
					break;
				case 2: 
					System.out.println( " has " + ( isLeapYear( year ) ? "29 days": "28 days" ) );
					break;
			}
			
		} else {
			
			System.out.println( "Invalid month input !!" );
		}
	}
	
	public static void main(String[] args) {
		
		Scanner getInp = new Scanner( System.in );
		
		System.out.println( "Days In Month Of Inputted Year & Month" );
		System.out.print( "\nEnter year :: " );
		int year = getInp.nextInt();
		System.out.print( "Enter month :: " );
		int month = getInp.nextInt();
		printDaysFromMonth( month, year );
		
	}
}