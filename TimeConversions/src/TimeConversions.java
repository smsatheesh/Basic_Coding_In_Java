import java.util.*;

class TimeConversions {

	private static String getDurationString( long hrs, long min, long sec, String hrStr, String minStr, String secStr ) {
		
		String yrString = "00", monthString = "00", dayString = "00";
		long yr = 0, mon = 0, days = 0;
		
		days = hrs / 24;
		if( days >= 30 )
			mon = days / 30;
		if( mon >= 12 )
			yr = mon / 12;
		
		hrs = hrs % 24;
		days = days % 30;
		mon = mon % 12;
		
		dayString = String.valueOf( days );
		monthString = String.valueOf( mon );
		yrString = String.valueOf( mon );
		
		if( days < 0 )
			dayString = "0" + dayString;
		
		if( mon < 0 )
			monthString = "0" + monthString;
		
		if( yr < 0 )
			yrString = "0" + yrString;
		
		hrStr = ( hrs != 0 ) ? String.valueOf( hrs ): "00";
		
		return ( yrString + " Year's " + monthString + " Month's " + dayString  + " Day's " + hrStr + " HH's " + minStr + " MM's " + secStr + " SS's" );
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
			
			if( hrs >= 24 )
				return getDurationString( hrs, min, sec, hrsString, minString, secString );
			
			if( min >= 60 )
				return getDurationString( min, sec );
			
			return ( hrsString + " HH's " + minString + " MM's " + secString + " SS's" );
		}
	}
	
	private static String getDurationString( long sec ) {
		
		if( sec < 0 ) 
			return INVALID_MSG;
		else {
			
			return getDurationString( sec/60, sec%60 );
		}
	}
	
	
	public static void main(String[] args) {
		
		long min, sec;
		Scanner getInp = new Scanner( System.in );
	
		System.out.println( "Time Conversion ? " );
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