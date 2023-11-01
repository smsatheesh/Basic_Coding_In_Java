import java.util.*;

class ArrayDeletion {

	static int[] deleteAtIndexInArray( int[] arr, int sz, int pos ) {
		
		int[] newArray = new int[ sz - 1 ];;
		
		if( pos >= 0 && pos <= sz ) {

			for( int i = 0, k = 0; i < sz  && k  < sz - 1; i++ ) {
			
				if( pos - 1 == i )
					continue;
				else
					newArray[ k++ ] = arr[i];
			}
						
			return newArray;
			
		}
		return new int[0];
	}
	
	static List<Integer> deleteAtIndexInArrayUsingList( int[] arr, int sz, int pos ) {
		
		Integer[] arrResp = IntStream.of( arr ).boxed().toArray( Integer[] :: new);
		
		List<Integer> list = new ArrayList<Integer>( Arrays.asList( arrResp ) );
		
		System.out.println( list.remove( pos - 1 ) );
		
		return list;
	}
	
	public static void main(String[] args) {
		
		Scanner getInp = new Scanner( System.in );
		System.out.print( "Array Deletion in JAVA" );
		System.out.print( "\nEnter size of array : " );
		
		int sz = getInp.nextInt();
		int[] arr = new int[sz];
		
		System.out.println( "Enter elements : " );
		for( int loopVar = 0; loopVar < sz; loopVar++ )
			arr[loopVar] = getInp.nextInt();
		
		System.out.println( "Enter position to be deleted : " );
		int pos = getInp.nextInt();
		
		int[] respFromNewArray = deleteAtIndexInArray( arr, sz, pos );
		
		System.out.println( "\n--- New Array Approach --- " );
		if( respFromNewArray.length >= 0 )
			System.out.println( "Element " + arr[ pos - 1 ] + " is deleted and resultant array is " + Arrays.toString( respFromNewArray ) );
		else
			System.out.println( "Make sure the  for insertion, since it's in out of bound  !!" );
		
		System.out.println( "\n--- ArrayList Approach --- " );
		List<Integer> arrResp = deleteAtIndexInArrayUsingList( arr, sz, pos );
		System.out.println( "Element " + arr[ pos - 1 ] + " is deleted and resultant array is " + Arrays.toString( arrResp.toArray() ) );
		
	}
}