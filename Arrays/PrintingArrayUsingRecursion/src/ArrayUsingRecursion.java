import java.util.*;

class ArrayUsingRecursion {

	static void printArrayUsingRecursive( int[] arr, int start, int end ) {
		
		if( start >= end ) {
			return;
		} else {
			
			System.out.print( "Index at -> " + start + " and value -> " + arr[start] + "\n" );
			printArrayUsingRecursive(arr, start + 1, end);
		}
	}

	public static void main(String[] args) {
		
		Scanner getInp = new Scanner(System.in);
		System.out.println("Array printing elements using recursive approach");
		System.out.print("Enter size ::: ");
		int sz = getInp.nextInt();
		System.out.println("Enter elements : ");
		
		int[] arr = new int[sz];
		for( int loopVar = 0; loopVar < sz; loopVar++ )
			arr[loopVar] = getInp.nextInt();
		
		printArrayUsingRecursive( arr, 0, sz );
		
	}
}