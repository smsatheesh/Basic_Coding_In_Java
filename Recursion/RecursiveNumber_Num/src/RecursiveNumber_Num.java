import java.util.*;

class RecursiveNumber_Num {
	
	static void reverseNumber( int num ) {
		
		if( num == 0 ) 
			System.out.println();
		else {
			
			System.out.print(num % 10);
			reverseNumber( num / 10 );
		}
	}
	
	public static void main(String[] args) {
		
		Scanner getInp = new Scanner(System.in);
		System.out.println( "Reverse of a Number Using Recursion" );
		System.out.println( "Enter number : " );
		int num = getInp.nextInt();
		
		System.out.println( "Reverse of a number");
		reverseNumber(num);
	}
}