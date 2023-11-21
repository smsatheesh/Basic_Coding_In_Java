import java.util.*;

class HoursMinSecConversion {

	private static final String INVALID_MSG = "Invalid value !";
	
	private static String getDurationString( long sec ) {
		
		if( sec < 0 ) 
			return INVALID_MSG;
		else {
			
			return getDurationString( sec/60, sec%60 );
		}
	}
	
	private static String getDurationString( long min, long sec ) {
		
		if( min < 0 )
			return INVALID_MSG;
		else {
			
			String hrsString = "00", minString = "00", secString = "00";
			long hrs = min / 60;
			min = min % 60;
			min += sec / 60;
			sec %= 60;
						
			hrsString = String.valueOf( hrs );
			minString = String.valueOf( min );
			secString = String.valueOf( sec );
			if( hrs < 10 )
				hrsString = "0" + hrsString;
			
			if( min < 10 )
				minString = "0" + minString;
			
			if( sec < 10 )
				secString = "0" + secString;
			
			if( min >= 60 )
				return getDurationString( min, sec );
			
			return ( hrsString + " HH's " + minString + " MM's " + secString + " SS's" );
		}
	}

	public static void main(String[] args) {
		
		long min, sec;
		Scanner getInp = new Scanner( System.in );
	
		System.out.println( "Hour's Minute's And Seconds Conversion ? " );
		System.out.print( "\nEnter Minutes :: " );
		min = getInp.nextLong();
		System.out.print( "Enter Seconds :: " );
		sec = getInp.nextLong();
		
		System.out.println( "\nUsing only seconds -> " );
		System.out.println( getDurationString( sec ) );
		
		System.out.println( "\nUsing only minutes and seconds -> " );
		System.out.println( getDurationString( min, sec ) );;
		
		getInp.close();
	}
}