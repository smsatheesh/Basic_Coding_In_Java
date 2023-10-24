public class Number7
{
    
	public static void main(String[] args) {
	
	   int num = 6, cc = 1;
	   
	   for(int i = 1; i < num; i++) {
	       
	       for(int j = 1; j <= i; j++) {
                System.out.print(cc + " ");
               ++cc;
	       }
	       System.out.println();
	   }
	}
}
