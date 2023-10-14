import java.util.*;

class EvenOrOdd {
	
	static void checkType(int num) {
		
		if(num != 0) {
    		if(num % 2 == 0)
        		System.out.println(num + " is even number");
        	else
        		System.out.println(num + " is odd number");
    	} else {
    		System.out.println("Number is neither even nor odd");
    	}
	}
	
    public static void main(String[] args) {

    	Scanner getInp = new Scanner(System.in);
    	System.out.println("Even or odd program? by SM Satheesh");
    	int num = getInp.nextInt();
    	
    	checkType(num);
    	getInp.close();
    }
}