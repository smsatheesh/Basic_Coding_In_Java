import java.util.*;

class ProgramToPrintNthLargest {

	static void printNthLargestElement(int[] arr, int len, int key) {
	
		// sort an array in descending order
		for(int outerVar = 0; outerVar < len; outerVar++) {
			
			int min = arr[outerVar];
			for(int innerVar = outerVar + 1; innerVar < len; innerVar++) {
				
				if(min > arr[innerVar]){
					
					int tempVar = arr[outerVar];
					arr[outerVar] = arr[innerVar];
					arr[innerVar] = tempVar;
				}
			}
		}

		try {
			if(key <= len)
				System.out.println("Position of " + key + " is " + arr[len - key]);
			else
				System.out.println("Enter postion to search element is greater than length entered");
		} catch(Exception e) {
			System.out.println("Enter natural numbers for positions....");
		}
	}
	
	public static void main(String[] args) {
		
    	Scanner getInp = new Scanner(System.in);
    	System.out.println("Find nth largest element program? by SM Satheesh");
    	System.out.println("Enter size ?");
    	int size = getInp.nextInt();
    	int[] arr = new int[size];
    	System.out.println("Enter elements ? ");
    	for(int loopItr = 0; loopItr < size; loopItr++)
    		arr[loopItr] = getInp.nextInt();
    	
    	System.out.println("Enter position to print largest element");
    	int pos = getInp.nextInt();
    	printNthLargestElement(arr, size, pos);
    	
    	getInp.close();
    }
}