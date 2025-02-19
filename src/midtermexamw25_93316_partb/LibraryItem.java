package midtermexamw25_93316_partb;

import java.util.Scanner;

public class LibraryItem {
    private static Book[] books = {
        new Book("The Great Gatsby"),
        new Book("1984"),
        new Book("To Kill a Mockingbird"),
        new Book("The Catcher in the Rye")
    };
    private AvailabilityChecking availabilityChecker = new AvailabilityChecking();

    public void displayCatalog() {
        System.out.println("Welcome to the library! Here is a list of available books:");
        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ". " + books[i].getTitle() + 
                " - " + (books[i].isAvailable() ? "Available" : "Not Available"));
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
}