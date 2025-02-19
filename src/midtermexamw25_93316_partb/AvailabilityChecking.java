//initial Commit
package midtermexamw25_93316_partb;

// Manages book availability (Loose Coupling: Uses Book class)
public class AvailabilityChecking {
    private Book[] books; // Loose Coupling: Uses Book class

    public AvailabilityChecking(Book[] books) {
        this.books = books;
    }

    public boolean isBookAvailable(int index) {
        return index >= 0 && index < books.length && books[index].isAvailable();
    }

    public void borrowBook(int index) {
        if (isBookAvailable(index)) {
            books[index].borrowBook();
        }
    }

    public void returnBook(int index) {
        if (index >= 0 && index < books.length) {
            books[index].returnBook();
        }
    }
}
