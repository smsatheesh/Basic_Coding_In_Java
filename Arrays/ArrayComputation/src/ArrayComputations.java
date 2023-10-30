import java.util.*; 

class ArrayComputations {
	
	static int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum = 0;
	
	static void printArrayUsingRecursive( int[] arr, int start, int end ) {
		
		if( start >= end ) {
			printMinMaxSumOfArray();
			return;
		} else {
			
			if( min > arr[start] )
				min = arr[start];
			if( max < arr[start] )
				max = arr[start];
			
			sum += arr[start];
			
			printArrayUsingRecursive(arr, start + 1, end);
		}
	}
	
	static void printMinMaxSumOfArray() {
		
		System.out.println( "  Minimum value : " + min );
		System.out.println( "  Maximum value : " + max );
		System.out.println( "Sum of elements : " + sum );
	}

	public static void main(String[] args) {
		
		Scanner getInp = new Scanner(System.in);
		System.out.println("Array printing elements using recursive approach");
		System.out.print("Enter size ::: ");
		int sz = getInp.nextInt();
		System.out.println("Enter elements : ");
		
		int[] arr = new int[sz];
		for( int loopVar = 0; loopVar < sz; loopVar++ )
			arr[loopVar] = getInp.nextInt();
		
		printArrayUsingRecursive( arr, 0, sz );
		
	}
}