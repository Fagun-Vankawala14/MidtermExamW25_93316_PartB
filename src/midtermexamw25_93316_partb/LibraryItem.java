package midtermexamw25_93316_partb;

/*
Author: jay Patel
 */

/*
> Single Responsibility Principle (SRP):
Availability checking is part of the primary duty of verifying the status of books that 
are being borrowed, returned, or checked.  LibraryItem now combines user selection and 
catalog display, it at least assigns availability checks to AvailabilityChecking.

> Encapsulation:
Within AvailabilityChecking, bookAvailability is private. It can only be altered by its techniques. 
By doing this, the array is shielded from outside modification. You could also make books private in 
LibraryItem for a more comprehensive solution, but in this case, we only added comments 
without altering the code structure.
*/

import java.util.Scanner;

public class LibraryItem {
    // SRP: The array of books is the main for this class. 
    private static String[] books = {"The Great Gatsby", "1984", "To Kill a Mockingbird", "The Catcher in the Rye"};
    
    // SRP: AvailabilityChecking is a separate class responsible for checking and updating availability.
    private AvailabilityChecking availabilityChecker = new AvailabilityChecking();

    // SRP: The method focuses on listing the catalog, so it partially meets the principle.
    public void displayCatalog() {
        System.out.println("Welcome to the library! Here is a list of available books:");
        //Comaplete this method to display list of books
        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }

    }

    // Allow user to select the Book
    public void selectBook(Scanner sc) {
        System.out.print("\nEnter the Book number which you want to borrow: ");
        int choice = sc.nextInt() - 1;

        if (choice < 0 || choice >= books.length) {
            System.out.println("Invalid selection. Please try again.");
            return;
        }
        
        // SRP & Encapsulation synergy: The actual checking logic is inside AvailabilityChecking (another class).
        if (availabilityChecker.isBookAvailable(choice)) {
            System.out.println("You selected: " + books[choice] + ". Enjoy your reading!");
            availabilityChecker.borrowBook(choice); // Updates availability in AvailabilityChecking
        } else {
            System.out.println("Sorry, " + books[choice] + " is currently unavailable. Please select another book.");
        }
    }

    // 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryItem libraryItem = new LibraryItem(); // Create an instance of LibraryItem
        boolean continueBorrowing = true;

        while (continueBorrowing) {
            libraryItem.displayCatalog();
            libraryItem.selectBook(sc);

            System.out.print("\nWould you like to borrow another book? (yes/no): ");
            String response = sc.next().trim().toLowerCase();
            continueBorrowing = response.equals("yes");
        }

        System.out.println("Thank you for using the library!");
        sc.close();
    }
}
