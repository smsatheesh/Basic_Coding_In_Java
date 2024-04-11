import java.util.*;

class ArrayUniqueElements {

	static void removeDuplicatesInArray( int[] arr ) {
		
		int[] temp = new int[arr.length];
		int j = 0;
		
		Arrays.sort( arr );
		for( int i = 0; i < arr.length - 1; i++ ) {
			
			if( arr[i] != arr[i + 1] ) {
				temp[j++] = arr[i];
			}
		}
		
		temp[j++] = arr[ arr.length - 1 ];
		
		System.out.println( "After removing duplicates : " );
		for( int i = 0; i < j; i++ )
			System.out.print( temp[i] + " " );
	}
	
	static void removeDuplicatesUsingDS( int[] arr ) {
		
		Integer[] arrInit = IntStream.of( arr ).boxed().toArray( Integer[]:: new );  
		ArrayList<Integer> arrList = new ArrayList<Integer>( Arrays.asList( arrInit ) );
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>(arrList);
		
		System.out.println( "\nRemoving duplicates using HashSet" );
		System.out.println( Arrays.toString(set.toArray()) );
	}

	
	public static void main(String[] args) {
		
		Scanner getInp = new Scanner( System.in );
		System.out.print( "Frequency of Each Element in Array JAVA" );
		System.out.print( "\nEnter size of array : " );
		
		int sz = getInp.nextInt();
		System.out.println( "Enter elements : " );
		int[] arr = new int[sz];
		
		for( int loop = 0; loop < sz; loop++ )
			arr[loop] = getInp.nextInt();
		
		removeDuplicatesInArray( arr );
		removeDuplicatesUsingDS( arr );
	}
}
