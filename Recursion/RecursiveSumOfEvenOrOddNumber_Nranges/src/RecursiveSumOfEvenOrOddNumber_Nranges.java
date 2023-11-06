import java.util.*;

class RecursiveSumOfEvenOrOddNumber_Nranges {

	static int countOfEvenOrOdd( int start, int end, String type ) {
		
		if( start > end )
			return 0;
		
		if(( type.equals( "even" ) ) && ( start % 2 == 0 )) {
			
			return start + countOfEvenOrOdd( start + 1, end, type );
		} else if(( type.equals( "odd" ) ) && ( start % 2 != 0 )) {
			
			return start + countOfEvenOrOdd( start + 1, end, type );
		} else {
			
			return countOfEvenOrOdd( start + 1, end, type );
		}
 			
	}
	
	public static void main(String[] args) {
		
		Scanner getInp = new Scanner(System.in);
		System.out.println( "Sum of Odd / Even Numbers Using Recursion" );
		System.out.println( "Enter start number : " );
		int numStart = getInp.nextInt();
		System.out.println( "Enter end number : " );
		int numEnd = getInp.nextInt();
		
		String str = "";
		while( !( str.equals( "end" ) || str.equals( "exit" ) )) {
			
			System.out.println( "Enter type : (even / odd / ( end or exit )) : " );
			str = getInp.next();
			
			str = str.toLowerCase();
			if( str.equals( "even" ) ) {
				
				System.out.println( "Event number sum -> " + countOfEvenOrOdd( numStart, numEnd, str ) );
			} else if( str.equals( "odd" ) ) {
				
				System.out.println( "Odd number sum -> " + countOfEvenOrOdd( numStart, numEnd, str ) );
			} else if( str.equals( "end" ) || str.equals( "exit" )) {
				System.out.println( "\n Terminated ..... " );
				break;
			} else {
				
				System.out.println( "\nInvalid Input" );
			}
		}		
	}
}