public class Number9
{
    
	public static void main(String[] args) {
	
	   int num = 6, count = 1;
	   
	   for(int i = 1; i <= (num * 2) - 1; i++) {
	       
	       for(int j = 0; j <= (num * 2) - 1; j++) {
	           
	           if((i == j) || (i + j  == 2 * num)) {
	                System.out.print(count);  
	           } else
	            System.out.print(" ");
	       }
	       
	       if(i < num)
	        ++count;
	       else
	        --count;
	       System.out.println();
	   }
	}
}
