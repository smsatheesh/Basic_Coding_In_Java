import java.util.*;

class StringComparison{

	static void compareUsingEquals( String firstString, String secondString ) {
		
		System.out.println( firstString.equals( secondString ) );
	}
	
	static void compareUsingEqualOperator( String firstString, String secondString ) {
		
		System.out.println( firstString == secondString );
	}
	
	static void compareUsingCompareToMethod( String firstString, String secondString ) {
		
		boolean resp = (firstString.compareTo( secondString ) == 0 )? true: false; 
		System.out.println( resp );
	}
	
	public static void main(String[] args) {
		
		System.out.println( "String Comparison" );
		Scanner getInp = new Scanner(System.in);
		
		System.out.print( "Enter string first :: " );		
		String strFirst = getInp.nextLine();
		System.out.print( "Enter string second :: " );
		String strSecond = getInp.nextLine();
		
		System.out.print( "\nString Comparison using Equals method() -> " );
		compareUsingEquals( strFirst, strSecond );
		System.out.print( "String Comparison using Equal operator -> " );
		compareUsingEqualOperator( strFirst, strSecond );
		System.out.print( "String Comparison using CompareTo method() -> " );
		compareUsingCompareToMethod( strFirst, strSecond );
		
	}
}