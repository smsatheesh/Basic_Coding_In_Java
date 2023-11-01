import java.util.*;

class ArrayFrequencyCount {
	
	static void printFrequencyOfElementsWithNavieApproach( int[] arr ) {
		
		int[] freq = new int[ arr.length ];
		int visited = -1;
		int count = 0;
		
		for( int otrLoop = 0; otrLoop < arr.length; otrLoop++ ) {
			
			if( arr[ otrLoop ] == visited )
				continue;
			
			count = 1;
			for( int innrLoop = otrLoop + 1; innrLoop < arr.length; innrLoop++ ) {
				
				if( arr[ otrLoop ] == arr[ innrLoop ] ) {
					
					count++;
					freq[ innrLoop ] = visited;
				}
			}
			
			if( freq[ otrLoop ] != visited ) {
				
				freq[ otrLoop ] = count;
			}
		}

		int idex = 0;
		for( int ele: freq ) {
			
			if( ele != visited ) {
				
				System.out.println( "Element : " + arr[idex] + " ---> " + ele );
			}
			++idex;
		}
		
	}
	
	static void printFrequencyOfElementsUsingSorting( int[] arr ) {
		
		Arrays.sort( arr );
		int count = 1;
		
		for( int i = 0; i < arr.length; i++ ) {
			
			count = 1;
			while( i < arr.length - 1 && ( arr[i] == arr[i + 1] ) ) {
				
				count++;
				i++;
			}
			
			System.out.println( "Element : " + arr[i] + " ---> " + count );
		}
	}
	
	static void printFrequencyOfElementUsingAdvancedApproach( int[] arr ) {
		
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		
		for( int i = 0; i < arr.length; i++ ) {
			
			if( mp.containsKey( arr[i] ) )
				mp.put( arr[i], mp.get(arr[i]) + 1 );
			else {
				mp.put(arr[i], 1);
			}
		}
		
		for( Map.Entry<Integer, Integer> entry: mp.entrySet() ) {
			
			System.out.println( entry.getKey() + " occurs and its count is " + entry.getValue() );
		}
	}
	
	public static void main(String[] args) {
		
		Scanner getInp = new Scanner( System.in );
		System.out.print( "Frequency of Each Element in Array JAVA" );
		System.out.print( "\nEnter size of array : " );
		
		int sz = getInp.nextInt();
		int[] arr = new int[sz];
		
		System.out.println( "Enter elements : " );
		for( int loopVar = 0; loopVar < sz; loopVar++ )
			arr[loopVar] = getInp.nextInt();
		
		System.out.println( "Using Navie Approach " );
		printFrequencyOfElementsWithNavieApproach( arr );
		
		System.out.println( "\nUsing Sorting Approach " );
		printFrequencyOfElementsUsingSorting( arr );
		
		System.out.println( "\nUsing Advanced Concepts Approach" );
		printFrequencyOfElementUsingAdvancedApproach( arr );
	}
}