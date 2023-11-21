import java.util.*;

class StringCharactersCounters {
	
	public static void main(String[] args) {
		
		System.out.println( "String Conversion of Each Character's its Own Case ?" );
		Scanner getInp = new Scanner(System.in);
		
		System.out.print( "Enter string :: " );		
		String str = getInp.nextLine();
	
		int letterCounter = 0, digitCounter = 0, specialCharCounter = 0;
		char[] chArr = str.toCharArray();
		for( int loopIdx = 0; loopIdx < chArr.length; loopIdx++ ) {
			
			char ch = chArr[loopIdx];
			if( Character.isLetter(ch) )
				++letterCounter;
			else if( Character.isDigit(ch) )
				++digitCounter;
			else {
				
				if( Character.isDefined(ch) )
					++specialCharCounter;
			}
					
		}
		
		System.out.println( "\n----------- RESULT ------------" );
		System.out.println( "String has " + letterCounter + " letters" );
		System.out.println( "String has " + digitCounter + " digits" );
		System.out.println( "String has " + specialCharCounter + " special characters" );
		System.out.println( "-------------------------------" );
		
	}
}