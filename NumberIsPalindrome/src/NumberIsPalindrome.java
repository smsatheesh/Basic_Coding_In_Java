import java.util.*;

class NumberIsPalindrome {
	
	static void checkPalindromeUsingStringConc(int num) {
		
		String strOfNum = String.valueOf(num);
		StringBuilder strBuild = new StringBuilder(strOfNum);
		
		if((String.valueOf(num)).equals(strBuild.reverse().toString()))
			System.out.println(num + " is in palindrome");
		else
			System.out.println(num +  " is not a palindrome");
	}

	static void checkPalindromeUsingMathLogic(int num) {
		
		int temp = num;
		int rev = 0;
		while(num != 0) {
			rev = (rev * 10) + (num % 10);
			num /= 10;
		}
		
		if(temp == rev)
			System.out.println(temp + " is in palindrome");
		else
			System.out.println(temp + " is not a palindrome");
	}
	
	public static void main(String[] args) {
		
		Scanner getInp = new Scanner(System.in);
		System.out.println("Enter number ? ");
		int num = getInp.nextInt();
		
		checkPalindromeUsingStringConc(num); // using String concept
		checkPalindromeUsingMathLogic(num);  // using Math logic
	}
}
