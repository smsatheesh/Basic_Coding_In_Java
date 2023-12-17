public class Main
{	
	
	public static void main(String[] args) {
		
		System.out.println( "\t\t----Roots of Quadratic Equation-----\n" ); 
		Quad outerClassObj = new Quad( 2, -7, 3 );
		Quad.Disc innerClassObj = outerClassObj.new Disc();
		
		outerClassObj.calculate();
		innerClassObj.display();
	}
}