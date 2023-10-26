import java.util.*;

class OctalNumberConversion {
	
	static void printOctalToBinaryUsingInBuildMethod(int octal) {
		
		int octalValue = intOctalToDecimalUsingInBuildMethod(octal);
		System.out.println(Integer.toBinaryString(octalValue));
	}
	
	static void printOctalToBinaryUsingMathLogic(int octal) {
		
		int decimalValue = intOctalToDecimalUsingInBuildMethod(octal);
		int binaryValue = 0, i = 1;
		while(decimalValue != 0) {
			
			binaryValue += (decimalValue % 2) * i;
			decimalValue /= 2;
			i *= 10;
		}
		System.out.print(binaryValue);
		System.out.println();
	}
	
	static int intOctalToDecimalUsingInBuildMethod(int octal) {
		
		return Integer.parseInt(String.valueOf(octal), 8);	
	}
	
	static void printOctalToDecimalUsingMathLogic(int octal) {
		
		int decimalValue = 0, i = 0, rem = 0;
		
		while(octal != 0) {
			
			rem = octal % 10;
			decimalValue += rem * Math.pow(8, i);
			++i;
			octal /= 10;
		}
		
		System.out.print(decimalValue);
	}
	
	static void printOctalToHexaUsingInBuildMethod(int octal) {
		
		int decimalValue = intOctalToDecimalUsingInBuildMethod(octal);
		System.out.println(Integer.toHexString(decimalValue));
	}
	
	static void printOctalToHexUsingMathLogic(int octal) {
		
		String hexValue = "";
		char[] hexChars = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
		int decimalValue = intOctalToDecimalUsingInBuildMethod(octal);
		
		while(decimalValue != 0) {
			
			int rem = decimalValue % 16;
			hexValue = hexChars[rem++] + hexValue;
			decimalValue /= 16;
		}
		
		System.out.println(hexValue);
	}

	public static void main(String[] args) {
		
		Scanner getInp = new Scanner(System.in);
		System.out.print("Enter octal number ::: ");
		int num = getInp.nextInt();
		
		// OCTAL to BIN conversion
		System.out.println("\n--- BINARY CONVERSION ---");
		System.out.print("In-build methods -> ");
		printOctalToBinaryUsingInBuildMethod(num);
		System.out.print("Using Math logic -> ");
		printOctalToBinaryUsingMathLogic(num);
		
		// OCTAL to DECIMAL conversion
		System.out.println("\n\n--- DECIMAL CONVERSION ---");
		System.out.print("In-build methods -> ");
		int resP = intOctalToDecimalUsingInBuildMethod(num);
		System.out.println(resP);
		System.out.print("Using Math logic -> ");
		printOctalToDecimalUsingMathLogic(num);

		// OCTAL to HEX conversion
		System.out.println("\n\n--- HEXA CONVERSION ---");
		System.out.print("In-build methods -> ");
		printOctalToHexaUsingInBuildMethod(num);
		System.out.print("Using Math logic -> ");
		printOctalToHexUsingMathLogic(num);
		
	}
}
