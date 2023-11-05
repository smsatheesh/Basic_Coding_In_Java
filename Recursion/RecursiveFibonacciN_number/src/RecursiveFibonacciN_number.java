import java.util.*;

class RecursiveFibonacciN_number {
	
	static int fiboN( int n ) {
		
		if( n == 0 )
			return 0;
		else if( n == 1 )
			return 1;
		
		return fiboN( n - 1 ) + fiboN( n - 2 );
	}
	
	public static void main(String[] args) {

		Scanner getInp = new Scanner( System.in );
		System.out.println( "Recursive Fibonacci Number" );
		System.out.println( "Enter position of number to fibonacci : " );
		int position = getInp.nextInt();
		System.out.println( fiboN( position ) );
	}
}