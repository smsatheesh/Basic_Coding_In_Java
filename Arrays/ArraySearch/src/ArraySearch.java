import java.util.*;

class ArraySearch {
	
	static void linearSearch( int[] arr, int key ) {
		
		int keyIdx = -1;
		
		for( int loopVar = 0; loopVar < arr.length; loopVar++ ) {
			
			if( arr[loopVar] == key ) {
				keyIdx = loopVar;
				break;
			}
		}
		
		if( keyIdx == -1 )
			System.out.println( "Element " + key + " not found !" );
		else
			System.out.println( "Element found at " + ( keyIdx + 1 ) );
	}
	
	static void binarySearch( int[] arr, int key ) {
		
		Arrays.sort(arr);
		int low = 0, high = arr.length - 1;
		
		while( low <= high ) {
			
			int mid = (low + ( high - low ) / 2 );
			
			if( key == arr[mid] ) {
				System.out.println( "Element found at " + ( mid + 1 ) );
				return;
			}
			else if( key < arr[mid] )
				high = mid - 1;
			else
				low = mid + 1;
		}
		
		System.out.println( "Element " + key + " not found !" );
	}

	static void inBuildSearch( int[] arr, int key ) {
		
		Integer[] arrInt = IntStream.of( arr ).boxed().toArray( Integer[]:: new );
		List arrResp = Arrays.asList( arrInt );
		boolean flagForSearch = arrResp.contains(30);
		if( flagForSearch ) {
			
			System.out.println("Element found at " + arrResp.indexOf( key ) );
		} else {
			
			System.out.println( "Element " + key + " not found !" );
		}
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
		
		System.out.println( "Enter element to search : " );
		int key = getInp.nextInt();
		
		System.out.println( "\nLinear Search -> " );
		linearSearch( arr, key );
		
		System.out.println( "\nBinary Search -> " );
		binarySearch( arr, key );

		System.out.println( "\nIn-Build Methods -> " );
		inBuildSearch( arr, key );
	}
}