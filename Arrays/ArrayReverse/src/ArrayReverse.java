import java.util.*;

class ArrayReverse {

	static void reverseArrayUsingTempArray( int[] arr, int sz ) {

		int[] tempArr = new int[sz];
		int idx = sz - 1;
		for(int loop = 0; loop < sz; loop++) {

			tempArr[idx--] = arr[loop];
		}

		System.out.println( "\nUsing Temporary Array -> " );
		System.out.println( Arrays.toString(tempArr) );
	}

	static void reverseArrayUsingSwapping( int[] arr, int sz ) {

		for( int loopVar = 0; loopVar < sz / 2; loopVar++ ) {

			int tempVar = arr[sz - loopVar - 1];
			arr[sz - loopVar - 1] = arr[loopVar];
			arr[loopVar] = tempVar;
		}

		System.out.println( "\nUsing Swapping Approach -> " );
		System.out.println( Arrays.toString(arr) );
	}

	static void reverseArrayUsingCollections( int[] arr, int sz ) {

		Integer[] arrObj = IntStream.of(arr).boxed().toArray( Integer[]:: new );

		System.out.println( "\nUsing Collections Approach" );
		Collections.reverse( Arrays.asList(arrObj));
		System.out.println( Arrays.asList( arrObj ) );

	}

	public static void main(String[] args) {

		Scanner getInp = new Scanner( System.in );
		System.out.print( "Reversing Array in JAVA" );
		System.out.print( "\nEnter size of array : " );
		int sz = getInp.nextInt();

		int[] arr = new int[sz];
		System.out.println("Enter array elements : ");
		for( int loop = 0; loop < sz; loop++ )
			arr[loop] = getInp.nextInt();

		reverseArrayUsingTempArray( arr, sz );
		reverseArrayUsingSwapping( arr, sz );
		reverseArrayUsingCollections( arr, sz );
	}
}