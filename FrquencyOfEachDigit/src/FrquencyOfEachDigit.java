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
		
		for(int loopItr = 0; loopItr < freq.length; loopItr++)
			System.out.print(loopItr + " -> " + freq[loopItr] + "\n");
	}
	
	public static void main(String[] args) {
		
		Scanner getInp = new Scanner(System.in);
		System.out.println("Enter number ? ");
		int num = getInp.nextInt();
		
		printFrequencyOfEachDigitConatainsInNumber(num);
	}
}