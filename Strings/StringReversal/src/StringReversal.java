import java.util.*;

class StringReversal {
	
	static String toString( char[] ch ) {
		
		String str = new String( ch );
		return str;
	}
	
	static void reverseUsingLogic( String orgStr ) {
		
		String resStr = "";
		char ch;
		
		for( int idx = 0; idx < orgStr.length(); idx++ ) {
			
			ch = orgStr.charAt( idx );
			resStr = ch + resStr;
		}
		
		System.out.println( resStr );
	}
	
	static void reverseUsingByteArray( String orgStr ) {
		
		byte[] stringBytesArr = orgStr.getBytes();
		byte[] resultantBytesArr = new byte[stringBytesArr.length];
		for( int idx = 0; idx < resultantBytesArr.length; idx++ ) {
			
			resultantBytesArr[idx] = stringBytesArr[ stringBytesArr.length - idx - 1 ];
		}
		
		System.out.println( new String( resultantBytesArr ) );
			
	}
	
	static void reverseUsingStringBuilder( String orgStr ) {
		
		StringBuilder strBuilder = new StringBuilder( orgStr );
		String resultantString = new String( strBuilder.reverse().toString() );
		System.out.println( resultantString );
	}
	
	static void reverseUsingStringBuffer( String orgStr ) { 
		
		StringBuffer strBufferer = new StringBuffer( orgStr );
		String resultantString = new String( strBufferer.reverse().toString() );
		System.out.println( resultantString );
	}
	
	static void reverseUsingArrayList( String orgStr ) {
		
		char[] chArr = orgStr.toCharArray();
		List<Character> chList = new ArrayList<Character>();
		
		for( char ch: chArr )
			chList.add( ch );
		
		Collections.reverse(chList);
		Iterator itr = chList.iterator();
		while( itr.hasNext() )
			System.out.print( itr.next() );
	}
	
	static void reverseUsingStack( String orgStr ) {
		
		Stack<Character> chStack = new Stack<Character>();
		
		char[] chArr = orgStr.toCharArray();
		for( char ch: chArr )
			chStack.add( ch );
		
		String resultantStr = new String();
		while( !chStack.empty() ) {
			
			char pop = chStack.pop();
			resultantStr += pop;
		}
		
		System.out.println( resultantStr );
	}
	
	static void reverseUsingDivideAndConquer( String str ) {
		
		int left = 0, right = str.length() - 1;

		char[] chArr = str.toCharArray();
		while( left <= right ) {
			
			char temp = chArr[left];
			chArr[left] = chArr[right];
			chArr[right] = temp;

			left++;
			right--;
		}
		
		System.out.println( toString( chArr ) );
	}
	
	public static void main(String[] args) {
		
		System.out.println( "String Reverse ?" );
		Scanner getInp = new Scanner(System.in);
		
		System.out.print( "Enter string :: " );		
		String str = getInp.nextLine();
	
		System.out.print( "\nString reverse using logic         -> " );
		reverseUsingLogic( str );
		
		System.out.print( "String reverse using byte array    -> " );
		reverseUsingByteArray( str );
		
		System.out.print( "String reverse using StringBuilder -> " );
		reverseUsingStringBuilder( str );
		
		System.out.print( "String reverse using StringBuffer  -> " );
		reverseUsingStringBuffer( str );
		
		System.out.print( "String reverse using ArrayList     -> " );
		reverseUsingArrayList( str );
		
		System.out.print( "\nString reverse using Stack         -> " );
		reverseUsingStack( str );
		
		System.out.print( "\nString reverse using Divid&Conquer -> " );
		reverseUsingDivideAndConquer( str );
	}
}