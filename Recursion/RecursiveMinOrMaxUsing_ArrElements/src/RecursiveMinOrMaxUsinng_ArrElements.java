import java.util.*;

class RecursiveMinOrMaxUsing_ArrElements {

	static int printArrayRecursiveMaxOrMinElement( int arr[], int sz, String type ) {
		
		if( sz == 0 )
			return arr[0];
		else {
			if( type.equals( "MAX" ) )
				return Math.max( arr[sz - 1], printArrayRecursiveMaxOrMinElement( arr, sz - 1, "MAX" ));
			else if( type.equals( "MIN" ) )
				return Math.min( arr[sz-1] , printArrayRecursiveMaxOrMinElement( arr, sz - 1, "MIN" ));
		}
		
		return -1;
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
		
		int maxElement = printArrayRecursiveMaxOrMinElement( arr, size, "MAX" );
		System.out.println( maxElement + " is the MAX element in array" );
		
		int minElement = printArrayRecursiveMaxOrMinElement( arr, size, "MIN" );
		System.out.println( minElement + " is the MIN element in array" );
	}
}