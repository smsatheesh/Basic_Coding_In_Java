import java.util.*;

class RecursiveIsPalindrome_ofString {
	
	static boolean isPalindrome( String str ) {
		
		str = str.toLowerCase();
		if( str.length() <= 1 )
			return true;
		else {
			
			if( str.charAt( 0 ) != str.charAt( str.length() - 1 ) )
				return false;

			String remStr = str.substring( 1, str.length() - 1 );
			return isPalindrome( remStr );
		}
	}
	
	public static void main(String[] args) {

		Scanner getInp = new Scanner( System.in );
		System.out.println( "Recursive Palindrome Of A String" );
		System.out.println( "Enter string : " );
		String str = getInp.next();
		if( isPalindrome( str ) )
			System.out.println( str + " is Palindrome" );
		else
			System.out.println( str + " is not a Palindrome" );
	}
}