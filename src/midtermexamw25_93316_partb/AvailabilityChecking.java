package midtermexamw25_93316_partb;
//My name is karandeep singh malhari

public class AvailabilityChecking {

    private boolean[] bookAvailability;

    // Constructor to initialize all books as available
    public AvailabilityChecking() {
        bookAvailability = new boolean[]{true, true, true, true}; // Assuming all books are available initially
    }

    // Method to check if a book is available
    public boolean isBookAvailable(int bookIndex) {
        if (bookIndex < 0 || bookIndex >= bookAvailability.length) {
            return false; // Invalid index
        }
        return bookAvailability[bookIndex]; // Return availability status
    }

    // Method to borrow a book (mark it as unavailable)
    public void borrowBook(int bookIndex) {
        if (bookIndex >= 0 && bookIndex < bookAvailability.length) {
            bookAvailability[bookIndex] = false; // Mark the book as borrowed
        }
    }
}

