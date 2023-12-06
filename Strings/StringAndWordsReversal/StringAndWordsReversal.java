public class StringAndWordsReversal
{

	static void reverseWords( String str ) {
		
		StringBuilder sBuild = new StringBuilder( str );
		sBuild = sBuild.reverse();
		
		String[] rev = sBuild.toString().split( " " );
		
		for( int loop = 0; loop < rev.length; loop++ ) {
			
			StringBuilder st = new StringBuilder( rev[loop] );
			System.out.print( st.reverse() + " " );
		}
	}
	
	public static void main( String[] args ) {
	
		Scanner getInp = new Scanner( System.in );
		System.out.println( "String And Each Word Reversal" );
		System.out.print( "Enter String :: " ); 
		String str = getInp.nextLine();
		
		System.out.print( "Reversal String :: " );
		reverseWords( str );
	}
}