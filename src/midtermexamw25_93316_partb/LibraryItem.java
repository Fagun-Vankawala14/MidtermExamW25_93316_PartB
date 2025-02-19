package midtermexamw25_93316_partb;

import java.util.Scanner;

public class LibraryItem {
    private Book[] books; // Loose Coupling: Uses Book class
    private AvailabilityChecking availabilityChecker;

    public LibraryItem() {
        books = new Book[]{
            new Book("The Great Gatsby"),
            new Book("1984"),
            new Book("To Kill a Mockingbird"),
            new Book("The Catcher in the Rye")
        };
        availabilityChecker = new AvailabilityChecking(books); // Dependency Injection (Loose Coupling)
    }

    public void displayCatalog() {
        System.out.println("Welcome to the library! Here is a list of available books:");

        for (int i = 0; i < books.length; i++) {
            String availability = books[i].isAvailable() ? "Available" : "Unavailable";
            System.out.println((i + 1) + ". " + books[i].getTitle() + " - " + availability);
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
            System.out.println("You selected: " + books[choice].getTitle() + ". Enjoy your reading!");
            availabilityChecker.borrowBook(choice);
        } else {
            System.out.println("Sorry, " + books[choice].getTitle() + " is currently unavailable.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryItem libraryItem = new LibraryItem();
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
