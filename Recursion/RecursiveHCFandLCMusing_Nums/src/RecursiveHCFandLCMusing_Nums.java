import java.util.*;

class RecursiveHCFandLCMusing_Nums {

	static int HCFandLCMrecursive( int num1, int num2 ) {
		
		if( num1 == 0 )
			return num2;
		else
			return HCFandLCMrecursive( num2 % num1, num1 );
	}
	
	public static void main(String[] args) {
		
		Scanner getInp = new Scanner(System.in);
		System.out.println( "HCF AND LCM of a Numbers Using Recursion" );
		System.out.println( "Enter number1 : " );
		int num1 = getInp.nextInt();
		System.out.println( "Enter number2 : " );
		int num2 = getInp.nextInt();
		
		int hcf = HCFandLCMrecursive( num1, num2 );
		System.out.println( "HCF / GCD is -> " + hcf );
		
		System.out.println( "GCD is -> " + ( ( num1 * num2 ) / hcf ) );
		
	}
}