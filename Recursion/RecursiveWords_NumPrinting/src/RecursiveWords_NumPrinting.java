import java.util.*;

class RecursiveWords_NumPrinting {

	static boolean countOfDigits( int num ) {
		
		boolean flag = false;
		int count = 0;
		
		while( num != 0 ) {
			
			count++;
			num /= 10;
		}
		
		if(count > 0)
			flag = true;
		
		return flag;
	}
	
	static void printWords( int n ) {
		
		int digit = n % 10;
		
		switch( digit ) {
		
			case 0:
				System.out.print( "Zero " );
				break;
			case 1: 
				System.out.print( "One " );
				break;
			case 2:
				System.out.print( "Two " );
				break;
			case 3:
				System.out.print( "Three " );
				break;
			case 4:
				System.out.print( "Four " );
				break;
			case 5:	
				System.out.print( "Five " );
				break;
			case 6:
				System.out.print( "Six " );
				break;
			case 7:
				System.out.print( "Seven " );
				break;
			case 8:
				System.out.print( "Eight " );
				break;
			case 9:
				System.out.print( "Nine " );
				break;
			default:
				break;
		}
	}

	static void printNumberInWords( int n ) {
		
		if( countOfDigits( n ) ) {
			
			printNumberInWords( n / 10 );
			printWords( n );
			
		} else {
			if( n != 0 )	
				printWords( n );
		}
			
	}
		
	public static void main(String[] args) {
		
		Scanner getInp = new Scanner(System.in);
		System.out.println( "Numbers In Words" );
		System.out.println( "Enter number : " );
		int num = getInp.nextInt();

		System.out.println( "\nNUMBER IN WORDS -> " );
		printNumberInWords( num );
	}
}