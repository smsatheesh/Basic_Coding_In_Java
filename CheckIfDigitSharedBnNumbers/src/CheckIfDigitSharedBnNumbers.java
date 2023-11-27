import java.util.*;

class CheckIfDigitSharedBnNumbers {

	
	static void getCheckOfEachDigits( int n1, int n2 ) {
		
		boolean flag = false;
		char[] arrN1 = String.valueOf( n1 ).toCharArray();
		char[] arrN2 = String.valueOf( n2 ).toCharArray();
		
		for( int i = 0; i < arrN1.length; i++ ) {
			
			for( int j = 0; j < arrN2.length; j++ ) {
				
				if( arrN1[i] == arrN2[j] ) {
					System.out.print( arrN1[i] + " exists in " + n1 + " " + new String( arrN1 ) );
					flag = true;
					break;
				}
			}
		}
		
		if( !flag )
			System.out.println( "No number have same digits.." );
	}
	
	public static void main(String[] args) {

		Scanner getInp = new Scanner( System.in );
		System.out.println( "Numbers Digits Check, If Shared ...?" );
		System.out.print( "Enter number 1 :: " );
		int n1 = getInp.nextInt();
		
		System.out.print( "Enter number 2 :: " );
		int n2 = getInp.nextInt();
		getCheckOfEachDigits( n1, n2 );
		
	}
}