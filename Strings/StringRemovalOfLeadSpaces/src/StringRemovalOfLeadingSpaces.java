import java.util.*;

public class StringRemovalOfLeadingSpaces
{
	
	public static void main( String[] args ) {
	
		Scanner getInp = new Scanner( System.in );
		System.out.println( "String Removal of Leading Spaces " );
		System.out.print( "\nEnter string with leading spaces :: " );
		String str = getInp.next();
		
		System.out.print( "After Removal of Leading Spaces :: " );
		System.out.println( str.trim() );
	}
}