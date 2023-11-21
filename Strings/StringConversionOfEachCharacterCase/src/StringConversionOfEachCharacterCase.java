import java.util.*;

class StringConversionOfEachCharacterCase {
	
	public static void main(String[] args) {
		
		System.out.println( "String Conversion of Each Character's its Own Case ?" );
		Scanner getInp = new Scanner(System.in);
		
		System.out.print( "Enter string :: " );		
		String str = getInp.nextLine();
	
		char[] chArr = str.toCharArray();
		for( int loopIdx = 0; loopIdx < chArr.length; loopIdx++ ) {
			
			char ch = chArr[loopIdx];
			if( Character.isLowerCase(ch) )
				chArr[loopIdx] = Character.toUpperCase(ch);
			else
				chArr[loopIdx] = Character.toLowerCase(ch);
		}
		
		StringBuilder strBuild = new StringBuilder();
		
		for( char ch: chArr )
			strBuild.append(ch);
		
		System.out.println( strBuild.toString() );
	}
}