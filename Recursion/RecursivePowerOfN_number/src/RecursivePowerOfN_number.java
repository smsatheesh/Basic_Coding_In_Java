import java.util.*;

class RecursivePowerOfN_number {

		
	static int performPowering( int n, int p ) {
		
		if( p == 1 )
			return n;
		else
			return n * performPowering( n, --p );
	}
		
	public static void main(String[] args) {
		
		Scanner getInp = new Scanner(System.in);
		System.out.println( "Recursive Power Of A Number" );
		System.out.println( "Enter number : " );
		int num = getInp.nextInt();
		System.out.println( "Enter power : " );
		int pow = getInp.nextInt();
		
		int resp = performPowering( num, pow );
		System.out.println( "Power of " + num + " is " + resp );
	}
}