import java.util.*;

public class StringOfAllCharacterCoutners
{

	static void countOccurances( String str ) {
		
		str = str.toLowerCase();
		LinkedHashSet<Character> hash = new LinkedHashSet<Character>();
		int freq[] = new int[26];
		
		for( int loop = 0; loop < 26; loop++ )
			freq[loop] = 1;
		
		for( char characterOccur : str.toCharArray() ) {
			
			if( hash.contains( characterOccur ) ) {
				freq[ characterOccur - 'a' ]++;
				continue;
			} else {
				hash.add( characterOccur );
			}
		}
		
		Iterator itr = hash.iterator();
		while( itr.hasNext() ) {
			char chCopy = itr.next().toString().charAt(0);
			System.out.print( chCopy + " -> " );
			System.out.println( freq[ chCopy - 'a' ] );
		}
	}
	
	public static void main( String[] args ) {
	
		Scanner getInp = new Scanner( System.in );
		System.out.println( "String Count of Each Character" );
		System.out.print( "Enter String :: " ); 
		String str = getInp.nextLine();
		
		System.out.print( "Characters and Occurences :: \n" );
		countOccurances( str );
	}
}