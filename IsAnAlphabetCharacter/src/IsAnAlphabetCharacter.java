import java.util.*;

class IsAnAlphabetCharacter {

	static void checkIfIsAlphabet(char ch) {
			
		String result = (((ch >= 'A') && (ch <= 'Z')) || ((ch >= 'a') && (ch <= 'z')))? "Alphabet" : "Non-alphabet";
		System.out.println(ch + " is an " + result);
	}
		
	
	public static void main(String[] args) {
		
    	Scanner getInp = new Scanner(System.in);
    	System.out.println("Whether enter character is an alphabet program? by SM Satheesh");
    	char ch = getInp.next().charAt(0);
    	
    	checkIfIsAlphabet(ch); // static method call
    	getInp.close();
    }
}