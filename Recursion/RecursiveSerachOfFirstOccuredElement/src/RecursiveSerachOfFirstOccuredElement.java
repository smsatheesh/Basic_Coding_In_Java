import java.util.*;

public class RecursiveSerachOfFirstOccuredElement{

	static int checkAndReturnIndex( int num, int[] arr, int idx ) {
		
		if( idx == arr.length )
			return -1;
		else if( num == arr[idx] )
			return ( idx + 1 );
		else
			return checkAndReturnIndex( num, arr, idx+1 );
	}
	
	public static void main (String[] args) {
    	
		Scanner getInp = new Scanner( System.in );
		System.out.println( "Enter size of an array : " );
		int sz = getInp.nextInt();
		int[] arr = new int[ sz ];
		System.out.println( "Enter elements : " );
		for( int i = 0; i < sz; i++ )
			arr[i] = getInp.nextInt();
		System.out.println( "Enter number to check : " );
		int num = getInp.nextInt();
		
		int result = checkAndReturnIndex( num, arr, 0);
		if( result != -1 )
			System.out.println( "Element present, at " + result );
		else
			System.out.println( "Element not present" );
    }
}