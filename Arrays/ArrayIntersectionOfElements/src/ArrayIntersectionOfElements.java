import java.util.*;

class ArrayIntersectionOfElements { 
	
	static void mergeArrayNaiveApproach( int[] arr1, int[] arr2, int len1, int len2 ) {
		
		List<Integer> arrList = new ArrayList<Integer>();
		
		for( int i = 0; i < len1; i++ ) {
			
			int flag = 0;
			for( int j = i + 1; j < len1; j++ ) {
				
				if( arr1[i] == arr1[j] ) {
					flag = 1;
					break;
				}
			}
			
			if( flag == 1 )
				continue;
			
			for( int j = 0; j < len2; j++ ) {
				
				if( arr1[i] == arr2[j] ) {
					arrList.add( arr1[i] );
					break;
				}
			}
		}
		
		System.out.println( arrList );
	}
	
	static void mergeArrayOptimizedApproach( int[] arr1, int[] arr2, int len1, int len2 ) {
		
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		
		set1 = Arrays.stream( arr1 )
					.boxed()
						.collect( Collectors.toSet() );
		set2 = Arrays.stream( arr2 )
					.boxed()
						.collect( Collectors.toSet() );

		System.out.print( "Intersecting Elements are ( Optimized-approach ) : " );

		for( int element: set1 ) {
			
			if( set2.contains( element ) )
				System.out.print( element + ", " );
		}

	}
	
	
	public static void main(String[] args) { 
		
		int[] arr1 = { 5, 8, 5, 9, 7, 8, 9 };
		int[] arr2 = { 5, 9, 30, 40, 50 };
		
		mergeArrayNaiveApproach( arr1, arr2, arr1.length, arr2.length );
		mergeArrayOptimizedApproach( arr1, arr2, arr1.length, arr2.length );
	} 
} 
