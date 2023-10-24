public class Number6
{
    
	public static void main(String[] args) {
	
	   int num = 6;
	   
	   for(int i = 1; i <= num; i++) {
	       
	       for(int j = 1; j <= num; j++) {
	           
	           if(j <= i)
	            System.out.print(j);
	           else
	            System.out.print(" ");
	       }
	       
	       for(int k = num; k > 0; k--) {
	           
	           if(k <= i)
	            System.out.print(k);
	           else
	            System.out.print(" ");
	       }
	        
	       System.out.println();
	   }
	}
}
