import java.util.*;

class MergeArrays {

	static void mergeArrays( int[] arr1, int[] arr2, int sz1, int sz2 ) {
		
		int[] res = new int[sz1 + sz2];
		
		int count = 0;
		for( int loop1 = 0; loop1 < sz1; loop1++ )
			res[count++] = arr1[loop1];
		
		for( int loop2 = 0; loop2 < sz2; loop2++ )
			res[count++] = arr2[loop2];
		
		System.out.println( "Resultant Array : " );
		for( int ele: res )
			System.out.print( ele + " " );
	}
	
	static void mergeArraysUsingInBuildMethod( int[] arr1, int[] arr2, int sz1, int sz2 ) {
		
		int[] newArr = new int[sz1 + sz2];
		
		System.arraycopy( arr1, 0, newArr, 0, sz1 );
		System.arraycopy( arr2, 0, newArr, sz1, sz2 );
		
		System.out.println( "\nResultant Array Using In-Build Method : " );
		for( int ele: newArr )
			System.out.print( ele + " " ); 
	}
	
	public static void main(String[] args) {
		
		Scanner getInp = new Scanner( System.in );
		System.out.print( "Merging Array in JAVA" );
		System.out.print( "\nEnter size of array 1 : " );
		int sz1 = getInp.nextInt();
		
		int[] arr1 = new int[sz1];
		System.out.println("Enter array 1 elements : ");
		for( int loop1 = 0; loop1 < sz1; loop1++ )
			arr1[loop1] = getInp.nextInt();
			
		System.out.print( "Enter size of array 2 : " );
		int sz2 = getInp.nextInt();
		
		int[] arr2 = new int[sz2];
		for( int loop2 = 0; loop2 < sz2; loop2++ )
			arr2[loop2] = getInp.nextInt();
		
		mergeArrays( arr1, arr2, sz1, sz2 );
		mergeArraysUsingInBuildMethod( arr1, arr2, sz1, sz2 );
	}
}