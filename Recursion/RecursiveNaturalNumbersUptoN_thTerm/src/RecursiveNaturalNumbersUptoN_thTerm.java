import java.util.*;

class RecursiveNaturalNumbersUptoN_thTerm {

	static void printNaturalnumbers( int n ) {
		
		if( n == 0 )
			return;
		else {
			printNaturalnumbers( n - 1 );
			System.out.print( n + " " );
		}
	}
		
	public static void main(String[] args) {
		
		Scanner getInp = new Scanner(System.in);
		System.out.println( "Natural Number Upto Nth Term" );
		System.out.println( "Enter number : " );
		int num = getInp.nextInt();

		System.out.println( "\nNATURAL NUMBERS " );
		printNaturalnumbers( num );
	}
}
