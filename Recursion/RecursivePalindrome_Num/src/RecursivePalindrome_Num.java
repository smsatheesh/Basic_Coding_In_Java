import java.util.*;

class RecursivePalindrome_Num {
	
	static int palindromeRecursive( int num, int rever_num ) {
		
		if( num < 10 ) {
			
			return rever_num * 10 + num;
		} else {
			
			rever_num = rever_num * 10 + (num % 10);
			return palindromeRecursive( num / 10, rever_num );
		}
	}
	
	public static void main(String[] args) {
		
		Scanner getInp = new Scanner(System.in);
		System.out.println( "Plaanidrome of a Number Using Recursion" );
		System.out.println( "Enter number : " );
		int num = getInp.nextInt();
		
		System.out.print( num + " number is " );
		System.out.print( (palindromeRecursive( num, 0 ) == num)? "Palindrome": "not a Palindrome" );
		
	}
}