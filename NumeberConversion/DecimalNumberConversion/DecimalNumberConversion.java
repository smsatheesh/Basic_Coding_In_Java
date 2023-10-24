import java.util.*;

class DecimalNumberConversion {
	
	static void printDecimalToBinaryUsingInBuildMethod(int num) {
		
		System.out.println(Integer.toBinaryString(num));
	}
	
	static void printDecimalToBinaryUsingMathLogic(int decimal) {
		
		int[] binary = new int[40];
		int index = 0;
		
		while(decimal != 0) {
			
			binary[index++] = decimal % 2;
			decimal /= 2;
		}
		
		for(int idx = index - 1; idx >= 0; --idx)
			System.out.print(binary[idx]);
		System.out.println();
	}
	
	static void printDecimalToOctalUsingInBuildMethod(int decimal) {
		
		System.out.println(Integer.toOctalString(decimal));	
	}
	
	static void printDecimalToOctalUsingMathLogic(int decimal) {
		
		int octalValue = 0, i = 1, rem = 0;
		
		while(decimal != 0) {
			
			rem = decimal % 8;
			octalValue += i * rem;
			
			decimal /= 8;
			i *= 10;
		}
		
		System.out.print(octalValue);
	}
	
	static void printDecimalToHexaUsingInBuildMethod(int decimal) {
		
		System.out.println(Integer.toHexString(decimal));
	}
	
	static void printDecimalToHexUsingMathLogic(int decimal) {
		
		String hexValue = "";
		char[] hexChars = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
		
		while(decimal != 0) {
			
			int rem = decimal % 16;
			hexValue = hexChars[rem++] + hexValue;
			decimal /= 16;
		}
		
		System.out.println(hexValue);
	}

	public static void main(String[] args) {
		
		Scanner getInp = new Scanner(System.in);
		System.out.print("Enter decimal number ::: ");
		int num = getInp.nextInt();
		
		// DECIMAL to BIN conversion
		System.out.println("\n--- BINARY CONVERSION ---");
		System.out.print("In-build methods -> ");
		printDecimalToBinaryUsingInBuildMethod(num);
		System.out.print("Using Math logic -> ");
		printDecimalToBinaryUsingMathLogic(num);
		
		// DECIMAl to OCT conversion
		System.out.println("\n\n--- OCTAL CONVERSION ---");
		System.out.print("In-build methods -> ");
		printDecimalToOctalUsingInBuildMethod(num);
		System.out.print("Using Math logic -> ");
		printDecimalToOctalUsingMathLogic(num);

		// DECIMAL to HEX conversion
		System.out.println("\n\n--- HEXA CONVERSION ---");
		System.out.print("In-build methods -> ");
		printDecimalToHexaUsingInBuildMethod(num);
		System.out.print("Using Math logic -> ");
		printDecimalToHexUsingMathLogic(num);
		
	}
}