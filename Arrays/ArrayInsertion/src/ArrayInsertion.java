import java.util.*;

class ArrayInsertion {

	static int[] insertAtIndexInArray( int[] arr, int sz, int ele, int pos ) {
		
		int[] newArray = new int[ sz + 1 ];;
		
		if( pos <= sz + 1 ) {

			for( int start = 0; start < pos - 1 ; start++ )
				newArray[start] = arr[start];
			
			newArray[ pos - 1 ] = ele;
			
			for( int end = pos; end < sz + 1; end++ )
				newArray[end] = arr[end - 1];
			
			return newArray;
			
		}
		return new int[0];
	}
	
	static void insertAtIndexInArrayUsingList( int[] arr, int sz, int ele, int pos ) {
		
		Integer[] p = IntStream.of( arr ).boxed().toArray( Integer[]::new );
		List arrResp = new ArrayList( Arrays.asList(p) );
		
		if( pos <= sz + 1 ) {
			
			if( pos > 0 ) {
				
				arrResp.add( pos - 1, ele );
				System.out.println( "Element " + ele + " is inserted and resultant array is " + Arrays.toString(arrResp.toArray()) );
			} else {
				System.out.println( "Position cannot be negative" );
			}
		} else {
			
			System.out.println( "Make sure the  for insertion, since it's in out of bound  !!" );
		}
	}
	
	public static void main(String[] args) {
		
		Scanner getInp = new Scanner( System.in );
		System.out.print( "Array Insertion in JAVA" );
		System.out.print( "\nEnter size of array : " );
		
		int sz = getInp.nextInt();
		int[] arr = new int[sz];
		
		System.out.println( "Enter elements : " );
		for( int loopVar = 0; loopVar < sz; loopVar++ )
			arr[loopVar] = getInp.nextInt();
		
		System.out.println( "Enter element to be inserted : " );
		int ele = getInp.nextInt();
		
		System.out.println( "Enter position to be inserted : " );
		int pos = getInp.nextInt();
		
		int[] respFromNewArray = insertAtIndexInArray( arr, sz, ele, pos );
		
		System.out.println( "\n--- New Array Approach --- " );
		if( respFromNewArray.length > 1 )
			System.out.println( "Element " + ele + " is inserted and resultant array is " + Arrays.toString( respFromNewArray ) );
		else
			System.out.println( "Make sure the  for insertion, since it's in out of bound  !!" );
		
		System.out.println( "\n--- ArrayList Approach --- " );
		insertAtIndexInArrayUsingList( arr, sz, ele, pos );
		
	}
}