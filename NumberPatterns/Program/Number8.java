public class Number8
{
    
	public static void main(String[] args) {
	
	   int num = 6;

	   for(int i = 1; i <= num; i++) {
	       
	       for(int j = 0; j <= num; j++) {
	           
	           if(i == j || i == num - j) {
	                System.out.print(i);  
	           } else
	            System.out.print(" ");
	       }
	       System.out.println();
	   }
	}
}
