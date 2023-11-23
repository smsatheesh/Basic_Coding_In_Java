import java.util.*;

class MultiplicationTable {
	
	public static void main(String[] args) {

		Scanner getInp = new Scanner(System.in);
		System.out.println( "Multiplication Table " );
		System.out.print( "\nEnter table to print :: " );
		int num = getInp.nextInt();
		
		System.out.print( "Enter range to print :: " );
		int range = getInp.nextInt();
		
		for( int i = 1 ; i <= range; i++ ) {
			
			System.out.println( i + " * " + num + " = " + i * num  );
		}
		
	}
}