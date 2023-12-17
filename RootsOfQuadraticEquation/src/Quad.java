class Quad {
	
	private double a, b, c;
	private double determinant;
	double root1 = 0.0, root2 = 0.0;
	double real, imaginary;
	
	public Quad( double a, double b, double c ) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.determinant = ( b * b) - ( 4 * a * c );
	}
	
	public void calculate() {
		
		if( determinant > 0 ) {

			root1 = ( -b + Math.sqrt( determinant )) / ( 2 * a );
			root2 = ( -b + Math.sqrt( determinant )) / ( 2 * a );
		} else if( determinant == 0 ) {
			
			root1 = root2 = -b / ( 2 * a );
		} else {
			
			real = -b / (2 * a);
		    imaginary = Math.sqrt(-determinant) / (2 * a);
		}
	}
	
	
	public class Disc {
		
		private double det = determinant;
	
		public void display() {
			
			System.out.println( det );
			if( det > 0 ) {
				
				System.out.format( "Square roots are %.2f and %.2f respectively\n", root1, root2 );
			} else if( det == 0 ) {
				
				System.out.format( "Roots are equal root1 = root2 = %.2f" , root1 );
			} else {
				
				System.out.format("root1 = %.2f + %.2fi", real, imaginary);
			    System.out.format("\nroot2 = %.2f - %.2fi", real, imaginary);
			}
		}
	}
}
