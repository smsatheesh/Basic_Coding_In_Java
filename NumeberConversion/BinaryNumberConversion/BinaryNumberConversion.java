import java.util.*;

class BinaryNumberConversion {
	
	static int intBinaryToDecimalUsingInBuildMethod(int binary) {
		
		return Integer.parseInt(String.valueOf(binary), 2);
	}
	
	static void printBinaryToDecimalUsingMathLogic(int binary) {
		
		int idx = 0, decimal = 0;
		
		while(true) {
			
			if(binary == 0)
				break;
			else {
				
				int rem = binary % 10;
				decimal += rem * Math.pow(2, idx);
				idx++;
				binary /= 10;
			}
		}
		System.out.println(decimal);
	}
	
	static void printBinaryToOctalUsingInBuildMethod(int binary) {
		
		binary = intBinaryToDecimalUsingInBuildMethod(binary);
		System.out.println(Integer.toOctalString(binary));	
	}
	
	static void printBinaryToOctalUsingMathLogic(int binary) {
		
		int octalValue = 0, i = 1, rem = 0;
		
		binary = intBinaryToDecimalUsingInBuildMethod(binary);
		
		while(binary != 0) {
			
			rem = binary % 8;
			octalValue += i * rem;
			
			binary /= 8;
			i *= 10;
		}
		
		System.out.print(octalValue);
	}
	
	static void printDecimalToHexaUsingInBuildMethod(int binary) {
		
		binary = intBinaryToDecimalUsingInBuildMethod(binary);
		System.out.println(Integer.toHexString(binary));
	}
	
	static void printBinaryToHexUsingMathLogic(int binary) {
		
		String hexValue = "";
		char[] hexChars = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
		
		binary = intBinaryToDecimalUsingInBuildMethod(binary);
		while(binary != 0) {
			
			int rem = binary % 16;
			hexValue = hexChars[rem++] + hexValue;
			binary /= 16;
		}
		
		System.out.println(hexValue);
	}

	public static void main(String[] args) {
		
		Scanner getInp = new Scanner(System.in);
		System.out.print("Enter binary number ::: ");
		int num = getInp.nextInt();
		
		// BIN to DECIMAL conversion
		System.out.println("\n--- DECIMAL CONVERSION ---");
		System.out.print("In-build methods -> ");
		int resp = intBinaryToDecimalUsingInBuildMethod(num);
		System.out.println(resp);
		System.out.print("Using Math logic -> ");
		printBinaryToDecimalUsingMathLogic(num);
		
		// BIN to OCT conversion
		System.out.println("\n\n--- OCTAL CONVERSION ---");
		System.out.print("In-build methods -> ");
		printBinaryToOctalUsingInBuildMethod(num);
		System.out.print("Using Math logic -> ");
		printBinaryToOctalUsingMathLogic(num);

		// BIN to HEX conversion
		System.out.println("\n\n--- HEXA CONVERSION ---");
		System.out.print("In-build methods -> ");
		printDecimalToHexaUsingInBuildMethod(num);
		System.out.print("Using Math logic -> ");
		printBinaryToHexUsingMathLogic(num);
		
	}
}
