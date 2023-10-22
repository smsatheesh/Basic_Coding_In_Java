import java.util.*;

class ArrayCopiesMultiFunctions {

	static int size;
	static int[] arr;
	
	static void printArrayOfCopiesUsingAssignment(int[] arr, int sz) {
		
		int[] b = arr; // Assignment operator
		
		b[0]++;
		
		System.out.println("\n\nAssignment Operator");
		for(int ele: b)
			System.out.print(ele+ " ");
		
		System.out.println("\nOriginal Array After Assignment");
		for(int ele: arr)
			System.out.print(ele + " ");
	}
	
	static void printArrayOfCopiesUsingIterativeApproach(int[] arr, int sz) {
	
		int[] b = new int[sz];
		
		for(int ele = 0; ele < sz; ele++)
			b[ele] = arr[ele];
		
		b[0]++; // changing bth element
		
		System.out.println("\n\nIterative Process");
		for(int ele: b)
			System.out.print(ele + " ");
		
		System.out.println("\nOriginal Array After Iterative ::");
		for(int ele: arr)
			System.out.print(ele + " ");	
	}
	
	static void printArrayOfCopiesUsingClone(int[] arr, int sz) {
		
		int[] b = new int[sz];
		b = arr.clone();
		b[0]++;
		
		System.out.println("\n\nClone() Method");
		for(int ele: b)
			System.out.print(ele + " ");
		
		System.out.println("\nOriginal Array After Clone()");
		for(int ele: arr)
			System.out.print(ele + " ");
	}
	
	static void printArrayOfCopiesUsingArrayCopy(int[] arr, int sz) {
	
		int[] b = new int[sz];
		System.arraycopy(arr, 0, b, 0, sz);
		
		b[0]++;
		System.out.println("\n\nArrayCopyOf() Method");
		for(int ele: b)
			System.out.print(ele + " ");
		
		System.out.println("\nOriginal Array");
		for(int ele: arr)
			System.out.print(ele + " ");
	}
	
	static void printArrayCopiesUsingArraysCopyOf(int[] arr, int sz) {
		
		int[] b = Arrays.copyOf(arr, sz);
		b[0]++;
		
		System.out.println("\n\nArraysCopyOf() Method");
		for(int ele: b)
			System.out.print(ele + " ");
		
		System.out.println("\nOriginal Array After ArraysCopyOf() Method");
		for(int ele: arr)
			System.out.print(ele + " ");
	}
	
	public static void main(String[] args) {
		
	    	Scanner getInp = new Scanner(System.in);
	    	System.out.println("Array Copies");
	    	System.out.println("Enter size of an array ? ");
	    	size = getInp.nextInt();
	    	arr = new int[size];
	    	System.out.println("Enter elements : ");
	    	
	    	for(int loopItr = 0; loopItr < size; loopItr++)
	    		arr[loopItr] = getInp.nextInt();
	    	
	    	System.out.println("Original Array :: ");
	    	for(int ele: arr)
	    		System.out.print(ele + " ");
	    	
	    	printArrayOfCopiesUsingAssignment(arr, size);			// Assignment Operator
	    	printArrayOfCopiesUsingIterativeApproach(arr, size);	// Iterative Approach
	    	printArrayOfCopiesUsingClone(arr, size);				// Clone()
	    	printArrayOfCopiesUsingArrayCopy(arr, size);			// ArrayCopy()
	    	printArrayCopiesUsingArraysCopyOf(arr, size);			// ArraysCopyOf()
	    	
	    	getInp.close();
    	}
}
