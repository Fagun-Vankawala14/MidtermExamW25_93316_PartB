package midtermexamw25_93316_partb;

import java.awt.print.Book;

public class AvailabilityChecking {

    private static boolean[] bookAvailability = {true, true, true, true};

    public boolean isBookAvailable(int index) {
        Iterable<Book> books = null;
        for (Book book : books) {
            boolean bookId = false;
        if (book.getId() == bookId) {
            return true;
        }
    }
    return false;
}

    public void borrowBook(int index) {
        if (isBookAvailable(index)) {
            bookAvailability[index] = false;
        }
    }

    public void returnBook(int index) {
        if (index >= 0 && index < bookAvailability.length) {
            bookAvailability[index] = true;
        }
    }
}
