class ShoppingCart {
	
	public ArrayList shoppingCart = new ArrayList();
	
	public static void printInstructions(){
	    System.out.println("\nPress");
	    System.out.println("0 - To print choices");
	    System.out.println("1 - To print shopping List");
	    System.out.println("2 - To add an item");
	    System.out.println("3 - To modify an item");
	    System.out.println("4 - To remove an item");
	    System.out.println("5 - To search an item");
	    System.out.println("6 - To exit the app");
	}
	
	public void addItem( String item ) {
		shoppingCart.add( item );
	}
	
	public void printList() {
		
		System.out.println( "There are " + shoppingCart.size() + " items." );
		for( int loop = 0; loop < shoppingCart.size(); loop++ )
			System.out.println( "Item number : " + (loop + 1) + " is " + shoppingCart.get(loop) );
	}
	
	public void modifyCart( int position, String newItem ) { 
		
		System.out.println( "Old item is " + shoppingCart.get(position - 1) );
		shoppingCart.set( position - 1, newItem );
		System.out.println( "Cart have been updated !!" );
	}
	
	public void removeItem( int position ) {
		
		String itemRemoveal = shoppingCart.get( position - 1 ).toString();
		shoppingCart.remove( position - 1 );
		System.out.println( itemRemoveal + " successfully removed" );
	}
	
	public String searchItem( String itemTobeSrch ) {
		
		if( shoppingCart.indexOf( itemTobeSrch ) > -1 ) {
			
			return ("Element found " + shoppingCart.get( shoppingCart.indexOf( itemTobeSrch ) ) );
		} else {
			
			return( null );
		}
	}
}
