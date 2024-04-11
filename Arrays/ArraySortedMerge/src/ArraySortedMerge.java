import java.util.*;

class ArraySortedMerge { 
	
	static void mergeArraysSortedApproach( int[] arr1, int[] arr2, int len1, int len2 ) {
		

		if( len1 > 0 || len2 > 0 ) {

			List<Integer> arrList = new ArrayList<Integer>();
			
			Arrays.sort( arr1 );
			Arrays.sort( arr2 );
			
			int i = 0, j = 0;
			
			while( i < len1 && j < len2 ) {
				
				if( arr1[i] < arr2[j] )
					arrList.add( arr1[i++] );
				else
					arrList.add( arr2[j++] );
			}
			
			if( i < len1 ) {
				
				while( i < len1 )
					arrList.add( arr1[i++] );
			}
			
			if( j < len2 ) {
				
				while( j < len2 )
					arrList.add( arr2[j++] );
			}
			
			System.out.print( "Sorted-Merged array are : " );
			System.out.println( arrList );
		} else {
			
			System.out.println( "No elements, were present in both arrays" );
		}
	}
	
	public static void main(String[] args) { 
		
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 10, 9, 8, 7, 6 };
		
		mergeArraysSortedApproach( arr1, arr2, arr1.length, arr2.length );
	} 
} 
