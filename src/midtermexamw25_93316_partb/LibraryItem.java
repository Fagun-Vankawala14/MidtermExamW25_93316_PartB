package midtermexamw25_93316_partb;

import java.util.Scanner;

public class LibraryItem {

    private static String[] books = {"The Great Gatsby", "1984", "To Kill a Mockingbird", "The Catcher in the Rye"};
    private AvailabilityChecking availabilityChecker = new AvailabilityChecking();

    
    

    public void selectBook(Scanner sc) {
        System.out.print("\nEnter the Book number which you want to borrow: ");
        int choice = sc.nextInt() - 1;

        if (choice < 0 || choice >= books.length) {
            System.out.println("Invalid selection. Please try again.");
            return;
        }

        if (availabilityChecker.isBookAvailable(choice)) {
            System.out.println("You selected: " + books[choice] + ". Enjoy your reading!");
            availabilityChecker.borrowBook(choice); // Updates availability in AvailabilityChecking
        } else {
            System.out.println("Sorry, " + books[choice] + " is currently unavailable. Please select another book.");
        }
    }

    public static void main(String[] args) {
         
        LibraryCatalog catalog = new LibraryCatalog();  
        catalog.displayCatalog(); 
    
        Scanner sc = new Scanner(System.in);
        LibraryItem libraryItem = new LibraryItem(); // Create an instance of LibraryItem
        boolean continueBorrowing = true;

        while (continueBorrowing) {
            
            libraryItem.selectBook(sc); 

            System.out.print("\nWould you like to borrow another book? (yes/no): ");
            String response = sc.next().trim().toLowerCase();
            continueBorrowing = response.equals("yes");
        }

        System.out.println("Thank you for using the library!");
        sc.close();
    }
}
