import java.util.*;

class FrquencyOfEachDigit {

	static void printFrequencyOfEachDigitConatainsInNumber(int num) {
		
		int[] arrOfNum = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int [] freq = new int[10];
		
		while(num != 0) {
			int digit = num % 10;
			int idx = -1;
			for(int loopItr = 0; loopItr < 10; loopItr++) {
				
				if(arrOfNum[loopItr] == digit) {
					idx = loopItr;
					freq[idx]++;
					break;
				}
			}
			num /= 10;
		}

		System.out.println( "Frequency of Elements : " ); 
		for(int loopItr = 0; loopItr < freq.length; loopItr++)
			System.out.print(loopItr + " -> " + freq[loopItr] + "\n");
	}

	printFrequencyMostOptimisedApproach( int[] arr ) {

		Arrays.sort( arr ); 
		int i = 0;
		System.out.println( "Frequency of Elements( Optimised Approach ) : " ); 
		while( i < arr.length ) {
			int count = 1;
			while( i < arr.length - 1 && arr[ i ] == arr[ i + 1 ] ) {
				++i;
				count += 1;
			}
			
			System.out.println( arr[i] + "-> " + count );
			++i;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner getInp = new Scanner(System.in);
		System.out.println("Enter number ? ");
		int num = getInp.nextInt();
		
		printFrequencyOfEachDigitConatainsInNumber(num);
	}
}
