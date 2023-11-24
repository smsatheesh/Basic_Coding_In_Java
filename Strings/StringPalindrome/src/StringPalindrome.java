import java.util.*;

class StringPalindrome {
	
		static boolean isBooleanUsingStringBuilder( String str ) {
		
		StringBuilder strBuilder = new StringBuilder( str );
		String strRev = strBuilder.reverse().toString();
		
		return ( strRev.equals( str ) );
	}
	
	static boolean isBooleanUsingStringBuffer( String str ) {
		
		StringBuffer strBuffer = new StringBuffer( str );
		String strRev = strBuffer.reverse().toString();
		
		return ( strRev.equals( str ) );
	}
	
	static boolean isBooleanUsingRecursive( String str, int start, int end ) {
		
		if( end == 0 || start == end )
			return true;
		else {
			
			if( str.charAt( start ) != str.charAt( end ) )
				return false;
			
			if( start < end + 1 )
				return isBooleanUsingRecursive( str, start + 1, end - 1 );
		}
		
		return true;
	}
	
	public static void main(String[] args) {

		Scanner getInp = new Scanner( System.in );
		System.out.println( "String Palindrome" );
		System.out.print( "\nEnter String :: " );
		String str = getInp.nextLine();
		
		str = str.toLowerCase();

		System.out.print( "\nUsing StringBuilder Approach -> " );
		System.out.println( isBooleanUsingStringBuilder( str ) ? "Palindrome": "Not a Palindrome" );
		
		System.out.print( "Using StringBuffer Approach  -> " );
		System.out.println( isBooleanUsingStringBuffer( str ) ? "Palindrome": "Not a Palindrome" );
		
		System.out.print( "Using Recursive Approach     -> " );
		System.out.println( isBooleanUsingRecursive( str, 0, str.length() - 1 ) ? "Palindrome": "Not a Palindrome" );		
	}
}