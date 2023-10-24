public class Number1
{
    
	public static void main(String[] args) {
	
	   int num = 6;
	   
	    for(int i = 1; i <= num; i++) {
	       
	       for(int k = num; k > i; k--)
	        System.out.print(" ");
	       
	       for(int j = 1; j <= i; j++) {
	           
	           System.out.print(j + " ");
	       }
	       System.out.println();
	   }
	}
}
