import java.util.*;

class EvenAndOddCountInArray {

	static void printEvenAndOddCounts(int[] arr, int len) {
	
		int evenCount = 0, oddCount = 0;
		for(int loopItr = 0; loopItr < len; loopItr++) {
			
			if(arr[loopItr] % 2 == 0)
				evenCount++;
			else if(arr[loopItr] % 2 != 0)
				oddCount++;
		}
		
		System.out.println("Event elements count " + evenCount);
		System.out.println("Odd elements count " + oddCount);
	}
	
	public static void main(String[] args) {
		
	    	Scanner getInp = new Scanner(System.in);
	    	System.out.println("Enter size of the element ? ");
	    	int size = getInp.nextInt();
	    	System.out.println("Enter elements ... ");
	    	int[] arr = new int[size];
	    	for(int loopItr = 0; loopItr < size; loopItr++)
	    		arr[loopItr] = getInp.nextInt();
	    	
	    	printEvenAndOddCounts(arr, size);
	    	
	    	getInp.close();
    	}
}
