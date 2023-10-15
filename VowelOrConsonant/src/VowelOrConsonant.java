import java.util.*;

class VowelOrConsonant {
	
	static int checkIfIsAlphabet(char ch, List<Character> list) {
			
		return list.indexOf(ch);
	}
		
	
	public static void main(String[] args) {
		
    	Scanner getInp = new Scanner(System.in);
    	System.out.println("Whether enter character is an vowel or consonant program? by SM Satheesh");
    	char ch = getInp.next().charAt(0);
    	
    	List<Character> chArrList = new ArrayList<Character>(Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'));
    	
    	int result = checkIfIsAlphabet(ch, chArrList); // static return type method call
    	if(result > -1)
    		System.out.println("Entered character " + ch + " is an vowel");
    	else
    		System.out.println("Entered character " + ch + " is an consonant"); 
    	
    	getInp.close();
    }
}