import java.util.*;

class StringConversionOfOwnCharacteristics {

	static boolean checkStringHasAllUpperCase( String str ) {
		
		char[] chArray = str.toCharArray();
		
		for( char chLit: chArray ) {
			
			if( Character.isLowerCase( chLit ) )
				return false;	// returns false if String has character any in LOWER CASE
		}
		
		return true;			// returns true if String has character all in UPPER CASE
	}
	
	public static void main(String[] args) {
		
		System.out.println( "String Checks, If do have Upper (or) Lower Case, Convets it.. ?" );
		Scanner getInp = new Scanner(System.in);
		
		System.out.print( "Enter string :: " );		
		String str = getInp.nextLine();
	
		if( checkStringHasAllUpperCase( str ) ) {
			
			str = str.toLowerCase();
			System.out.println( "In lower cases -> " + str );
		} else {
			
			str = str.toUpperCase();
			System.out.println( "In upper cases -> " + str );
		}
	}
}