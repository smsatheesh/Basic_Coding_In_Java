import java.util.*;

class StringValuesCopies {
	
	static void copyUsingAssignment( String st ) {
		
		String strCopy = st;
		System.out.println( st );
		System.out.println( st + " equals (==) " + strCopy + " is " + ( st == strCopy ));
		
	}
	
	static void copyUsingStringBuffer( String st ) {
		
		StringBuffer stBuff = new StringBuffer( st );
		System.out.println( stBuff );
		System.out.println( stBuff + " equals (==) " + stBuff + " is " + ( st == stBuff.toString() ) );
	}
	
	static void  copyUsingStringBuilder( String str ) {
		
		StringBuilder stBuild = new StringBuilder( str );
		System.out.println( stBuild );
		System.out.println( stBuild + " equals (==) " + stBuild + " is " + ( str == stBuild.toString() ) );
	}
	
	static void copyUsingStringCopyValueOfMethod( String str ) {
		
		String resUsingInBuildMethod = String.copyValueOf( str.toCharArray() );
		System.out.println( resUsingInBuildMethod );
		System.out.println( resUsingInBuildMethod + " equals (==) " + resUsingInBuildMethod + " is " + ( str == resUsingInBuildMethod ) );
	}
	
	public static void main(String[] args) {
		
		System.out.println( "String Copies" );
		System.out.print( "Enter String :: " );
		Scanner getInp = new Scanner(System.in);
		
		String str = getInp.nextLine();
		
		System.out.print( "\nUsing Direct Assignment :: " );
		copyUsingAssignment( str );
		
		System.out.println( "\nUsing StringBuffer :: " );
		copyUsingStringBuffer( str );
		
		System.out.println( "\nUsing StringBuilder :: " );
		copyUsingStringBuilder( str );
		
		System.out.println( "\nUsing String.copyValueOf() Method :: " );
		copyUsingStringCopyValueOfMethod( str );
	}
}