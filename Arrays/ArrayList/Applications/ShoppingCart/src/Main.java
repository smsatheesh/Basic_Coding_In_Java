import java.util.*;

public class Main
{
	
	private static Scanner scanner = new Scanner(System.in);
    public static ShoppingCart shopCart = new ShoppingCart();
    
	public static void main( String[] args ) {
	
		boolean exit = false;
		int userChoice;
		
		do {
			
			shopCart.printInstructions();
			userChoice = scanner.nextInt();
			switch( userChoice ) {
				case 0: 
					shopCart.printInstructions();
					break;
				case 1:
					shopCart.printList();
					break;
				case 2:
					System.out.println( "Enter item : " );
					String item = scanner.next();
					shopCart.addItem( item );
					break;
				case 3:
					System.out.println( "Enter pos : " );
					int post = scanner.nextInt();
					scanner.nextLine();
					System.out.println( "Enter new item " );
					String newItem = scanner.nextLine();
					shopCart.modifyCart( post, newItem );
					break;
				case 4:
					System.out.println( "Enter position : " );
					int pos = scanner.nextInt();
					shopCart.removeItem( pos );
					break;
				case 5:
					scanner.nextLine();
					System.out.println( "Enter item name to search : " );
					String itemSrch = scanner.nextLine();
					String res = shopCart.searchItem( itemSrch );
					System.out.println( res );
					break;
				case 6:
					exit = true;
					System.out.println( "Thank, you !!" );
					break;
			}
			
		} while( !exit );
	}
}