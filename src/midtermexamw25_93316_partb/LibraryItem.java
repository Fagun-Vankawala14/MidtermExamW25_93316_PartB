package midtermexamw25_93316_partb;

import java.util.Scanner;

public class LibraryItem {

    // Encapsulation: Made books private and added a getter method
    private static String[] books = {"The Great Gatsby", "1984", "To Kill a Mockingbird", "The Catcher in the Rye"};

    // Encapsulation: availabilityChecker is now private
    private AvailabilityChecking availabilityChecker = new AvailabilityChecking();

    /**
     * Displays the book catalog.
     * SRP: Handles only displaying books, does not manage availability logic.
     */
    public void displayCatalog() {
        System.out.println("\nAvailable Books:");
        for (int i = 0; i < books.length; i++) {
            String availability = availabilityChecker.isBookAvailable(i) ? "Available" : "Not Available";
            System.out.println((i + 1) + ". " + books[i] + " - " + availability);
        }
    }

    /**
     * Checks if the selected book index is valid.
     * SRP: This method is responsible for validation only.
     */
    private boolean isValidSelection(int choice) {
        return choice >= 0 && choice < books.length;
    }

    /**
     * Allows the user to select a book to borrow.
     * SRP: Uses `isValidSelection()` for validation, keeping selection logic separate.
     */
    public void selectBook(Scanner sc) {
        System.out.print("\nEnter the Book number which you want to borrow: ");
        int choice = sc.nextInt() - 1;

        if (!isValidSelection(choice)) { // SRP: Delegating validation to a separate method
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

    /**
     * Getter method to access books array in a controlled way.
     * Encapsulation: Prevents direct access to books.
     */
    public String getBook(int index) {
        return books[index];
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
