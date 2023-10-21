import java.util.*;

class PrintNumberInWords {
	
	static void printFrequencyOfEachDigitConatainsInNumber(int num) {
		
		int[] arrOfNum = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		String[] numInWords = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
		StringBuilder strRes = new StringBuilder();
		
		while(num != 0) {
			int noOfDigits = (int) Math.log10(num);
			int digit = (int) (num / Math.pow(10, noOfDigits));
			int idx = -1;
			for(int loopItr = 0; loopItr < 10; loopItr++) {
				
				if(arrOfNum[loopItr] == digit) {
					idx = loopItr;
					System.out.print(numInWords[idx] + " ");
					break;
				}
			}
			num = (int) (num % Math.pow(10, noOfDigits));
		}
	}
	
	public static void main(String[] args) {
		
		Scanner getInp = new Scanner(System.in);
		System.out.println("Enter number ? ");
		int num = getInp.nextInt();
		
		printFrequencyOfEachDigitConatainsInNumber(num);
	}
}