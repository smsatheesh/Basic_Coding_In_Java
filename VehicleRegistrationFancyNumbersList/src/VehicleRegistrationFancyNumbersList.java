public class VehicleRegistrationFancyNumbersList {
	
	static boolean getSum7Check( int num ) {
		
		int val = 0;
		
		while( num != 0 ) {
			val += num % 10;
			num /= 10;
		}
		if( val <= 10 )
			return ( val == 7 );
		else
			return getSum7Check( val );
	}
	
	static boolean checkDigitsOfOddNumberSame( int num ) {
		
		char[] ch = String.valueOf( num ).toCharArray();
		if( ch[ 1 ] == ch[ 3 ] )
			return true;
		else
			return false;
	}
	
	static boolean checkNumbersAreInUpFace( int num ) {
		
		char[] ch = String.valueOf( num ).toCharArray();
		if( ch[ 0 ] <= ch[ 2 ] )
			return true;
		else
			return false;
	}
	
	public static void main( String[] args ) {
		
		for( int i = 1000; i < 10000; ++i ) {
			if( checkDigitsOfOddNumberSame( i ) && getSum7Check( i ) && checkNumbersAreInUpFace( i ) ) {
				System.out.println( i );
			}
		}
	}
}