import java.util.*;

class RecursiveSumOfN_number {
	
	static int sumOfNnumbers( int n ) {
		
		if( n == 0 )
			return 1;
		else
			return n + sumOfNnumbers ( n - 1);
	}
	
	public static void main(String[] args) {

		Scanner getInp = new Scanner( System.in );
		System.out.println( "Enter range of number to add : " );
		int n = getInp.nextInt();
		System.out.println( sumOfNnumbers( n ) );
	}
}