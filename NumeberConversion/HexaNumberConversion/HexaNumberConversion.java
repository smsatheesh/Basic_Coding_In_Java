import java.util.*;

class HexaNumberConversion {
	
	static void printHexaToBinaryUsingInBuildMethod(String octal) {
		
		int octalValue = intHexaToDecimalUsingInBuildMethod(octal);
		System.out.println(Integer.toBinaryString(octalValue));
	}
	
	static void printHexaToBinaryUsingMathLogic(String hexa) {
		
		int decimalValue = intHexaToDecimalUsingInBuildMethod(hexa);
		int binaryValue = 0, i = 1;
		while(decimalValue != 0) {
			
			binaryValue += (decimalValue % 2) * i;
			decimalValue /= 2;
			i *= 10;
		}
		System.out.print(binaryValue);
		System.out.println();
	}
	
	static int intHexaToDecimalUsingInBuildMethod(String hexa) {
		
		return Integer.parseInt(hexa, 16);	
	}
	
	static void printHexaToDecimalUsingMathLogic(String octal) {
		
		int val = 0;
		String hexChars = "0123456789abcdef";
		octal = octal.toLowerCase();
		for(int i = 0; i < octal.length(); i++) {
			
			int idx = hexChars.indexOf(octal.charAt(i));
			val = 16 * val + idx;
		}
		
		System.out.print(val);
	}
	
	static void printHexaToOctalUsingInBuildMethod(String hexa) {
		
		int decimalValue = intHexaToDecimalUsingInBuildMethod(hexa);
		System.out.println(Integer.toOctalString(decimalValue));
	}

	static void printHexaToOctalUsingMathLogic(String hexa) {
		
		int len = hexa.length() - 1;
		int dec = 0;
		
		for(int i = 0; i < hexa.length(); i++) {
			
			char ch = hexa.charAt(i);
			
			switch(ch) {
				
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
					dec += intHexaToDecimalUsingInBuildMethod(String.valueOf(ch));
					break;
				case 'a':
				case 'A':
					dec += 10 * (Math.pow(16, len));
					len--;
					break;
				case 'b':
				case 'B':
					dec += 11 * (Math.pow(16, len));
					len--;
					break;
				case 'c':
				case 'C':
					dec += 12 * (Math.pow(16, len));
					len--;
					break;
				case 'd':
				case 'D':
					dec += 13 * (Math.pow(16, len));
					len--;
					break;
				case 'e':
				case 'E':
					dec += 14 * (Math.pow(16, len));
					len--;
					break;
				case 'f':
				case 'F':
					dec += 15 * (Math.pow(16, len));
					len--;
					break;
				default:
	                System.out.println("Invalid hexa input");
	                break;
			}
		}
		
		String oct ="";

		//converting decimal to octal number.
	    while(dec > 0)
	    {
	        oct = dec % 8 + oct;
	        dec = dec / 8;
	    }
	    
	    System.out.println(oct);
	}

	public static void main(String[] args) {
		
		Scanner getInp = new Scanner(System.in);
		System.out.print("Enter hexa number ::: ");
		String num = getInp.next();
		
		// HEXA to BIN conversion
		System.out.println("\n--- BINARY CONVERSION ---");
		System.out.print("In-build methods -> ");
		printHexaToBinaryUsingInBuildMethod(num);
		System.out.print("Using Math logic -> ");
		printHexaToBinaryUsingMathLogic(num);
		
		// HEXA to DECIMAL conversion
		System.out.println("\n\n--- DECIMAL CONVERSION ---");
		System.out.print("In-build methods -> ");
		int resP = intHexaToDecimalUsingInBuildMethod(num);
		System.out.println(resP);
		System.out.print("Using Math logic -> ");
		printHexaToDecimalUsingMathLogic(num);

		// HEXA to OCTAL conversion
		System.out.println("\n\n--- OCTA CONVERSION ---");
		System.out.print("In-build methods -> ");
		printHexaToOctalUsingInBuildMethod(num);
		System.out.print("Using Math logic -> ");
		printHexaToOctalUsingMathLogic(num);
		
	}
}