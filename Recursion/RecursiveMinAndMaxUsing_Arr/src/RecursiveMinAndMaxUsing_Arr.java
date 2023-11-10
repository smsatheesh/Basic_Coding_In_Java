import java.util.*;

class RecursiveMinAndMaxUsing_Arr {

	static void printArrayRecursive( int arr[], int sz ) {
		
		if( sz <= 0 )
			return;
		else {
			printArrayRecursive( arr, sz - 1 );
			System.out.print( arr[sz-1] + " ");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner getInp = new Scanner(System.in);
		System.out.println( "Display Array Elements Using Recursion" );
		System.out.println( "Enter size : " );
		int size = getInp.nextInt();
		
		int[] arr = new int[size];
		System.out.println( "Enter elements : " );
		for( int loopVar = 0; loopVar < size; loopVar++ )
			arr[loopVar] = getInp.nextInt();
		
		printArrayRecursive( arr, size );
	}
}