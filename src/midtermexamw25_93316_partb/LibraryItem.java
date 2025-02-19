package midtermexamw25_93316_partb;

import java.util.Scanner;

public class LibraryItem {
//    Here added the title of the book and author according to the book class created earlier.
//    Added the Book class to encapsulate book properties, improve cohesion.
    private static Book[] books = {
        new Book("The Great Gatsby", "ABC1"),
        new Book("1984", "ABC2"),
        new Book("To Kill a Mockingbird", "ABC3"),
        new Book("The Catcher in the Rye", "ABC4")
    };
    private AvailabilityChecking availabilityChecker = new AvailabilityChecking();
    
//  Changed displayCatalog() to show both the title and author of each book
//  It will improve the user experience and add clarity.
    public void displayCatalog() {
        for (int i = 0; i < books.length; i++) {
        System.out.println((i + 1) + ". " + books[i].getTitle() + " written by " + books[i].getAuthor());
        }
    }

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
