nclass MobilePhone {
	
	private static ArrayList<Contact> contacts = new ArrayList<Contact>();
	
	public void printContacts() {
		
		System.out.println( "Contacts List : " );
		for( int loop = 0; loop < contacts.size(); loop++ ) {
			System.out.println( (loop + 1) + ". " + (contacts.get( loop ).getName()) + " -> " + contacts.get( loop ).getPhoneNumber() );
		}
	}
	
	public boolean addContacts( Contact contact ) {
		
		if( findContact( contact ) >= 0 ) {
			
			System.out.println( "Contact already existed !!" );
			return false;
		} else {
			
			contacts.add( contact );
			System.out.println( "Contact added successfully." );
			return true;
		}
	}
	
	public boolean updateContact( Contact oldContact, Contact newContact ) {
		
		int positionOfOld = findContact( oldContact );
		if( positionOfOld == -1 ) {
			
			System.out.println( "Contact not found." );
			return false;
		} else {
			
			contacts.set(positionOfOld, newContact);
			System.out.println( "Contact have been updated." );
			return true;
		}
	}
	
	public boolean removeContact( Contact contact ) {
		
		int position = findContact( contact );
		if( position == -1 ) {
			
			System.out.println( "Contacts not found." );
			return false;
		} else {
			
			contacts.remove( position );
			System.out.println( "Contacts have been removed successfully." );
			return true;
		}
	}
	
	public Contact queryContact( String name ) {
		
		int position = findContacts( name );
		if( position >= 0 ) {
			return contacts.get( position );
		} else {
			return null;
		}
	}
	
	
	private static int findContact( Contact contact ) {
		return contacts.indexOf( contact );
	}
	
	private static int findContacts( String contactName ) {
		
		for( int i = 0; i < contacts.size(); i++ ) {
			
			Contact contact = contacts.get( i );
			if( (contact.getName()).equals( contactName ) )
				return i;
		}
		return -1;
	}	
}