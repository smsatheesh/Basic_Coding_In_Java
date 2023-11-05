import java.util.*;

class RecursiveFactorialOfN_number {
	
	static int fact( int n ) {
		
		if( n == 1 )
			return 1;
		else
			return n * fact ( n - 1);
	}
	
	public static void main(String[] args) {

		Scanner getInp = new Scanner( System.in );
		System.out.println( "Enter range of number to factorial : " );
		int n = getInp.nextInt();
		System.out.println( fact( n ) );
	}
}