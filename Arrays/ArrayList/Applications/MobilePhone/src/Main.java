public class Main
{
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - to shutdown\n" +
                           "1  - to print contacts\n" +
                           "2  - to add a new contact\n" +
                           "3  - to update an existing contact\n" +
                           "4  - to remove an existing contact\n" +
                           "5  - query if an existing contact exists\n" +
                           "6  - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }
    
    private static void startPhone() {
    	System.out.println( "Starting Phone..." );
    }
    
    private static void addNewContact() {
    	
    	System.out.println( "Enter new contact name : " );
    	String name = scanner.nextLine();
    	System.out.println( "Enter phone number : " );
    	String phone = scanner.nextLine();
    	Contact newContact = Contact.createContact( name, phone );
    	
    	if( mobilePhone.addContacts( newContact ) ) {
    		System.out.println("New contact added: name = " + name + ", phone = " + phone);
    	} else {
            System.out.println("Cannot add, " + name + " already on phone");
    	}
    }
    
    private static void updateContact() {
    	
    	System.out.println( "Enter existing contact name : " );
    	String oldName = scanner.nextLine();
    	Contact existingRecord = mobilePhone.queryContact( oldName );
    	if( existingRecord == null ) {
    		
    		System.out.println("Contact not found.");
            return;
    	} else {
    		
    		 System.out.print("Enter new contact name: ");
    		 String newName = scanner.nextLine();
    	     System.out.print("Enter new contact phone number: ");
    	     String newNumber = scanner.nextLine(); 
    	     
    	     Contact newContact = Contact.createContact( newName, newNumber );
    	     
    	     if( mobilePhone.updateContact(existingRecord, newContact) ) {
    	    	  System.out.println("Successfully updated record");
    	     } else {
    	    	 System.out.println("Error updating record.");
    	     }
    	}
    }
    
    private static void removeContact() {
    	
    	System.out.println( "Enter name to remove : " );
    	String name = scanner.nextLine();
    	Contact exisitingRecord = mobilePhone.queryContact( name );
    	if (exisitingRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
    	if( mobilePhone.removeContact( exisitingRecord ) ) {
    		System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }
    }
    
    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() + ", phone number is " + existingContactRecord.getPhoneNumber());
    }
    
	public static void main( String[] args ) {

		boolean quit = false;
        startPhone();
        
        do {
        	
        	printActions();
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }while (!quit);
	}
}