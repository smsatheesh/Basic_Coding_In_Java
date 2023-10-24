public class Number4
{
    
	public static void main(String[] args) {
	
	   int num = 13;
	   
	    for(int i = 1; i <= num; i += 2) {
	       
	       for(int k = num; k > i; k--)
    	    System.out.print(" ");
    	    
	       for(int j = 1; j <= i; j++)
	        System.out.print(j + " ");
	        
	       System.out.println();
	   }
	   
	   for(int i = num - 2; i >= 1; i -= 2) {
	       
	       for(int k = num; k > i; k--)
	        System.out.print(" ");
	       for(int j = 1; j <= i; j++)
	        System.out.print(j + " ");
	        
	       System.out.println();
	   }
	}
}
