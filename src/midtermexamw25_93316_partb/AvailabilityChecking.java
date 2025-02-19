package midtermexamw25_93316_partb;

public class AvailabilityChecking {
    // Encapsulation: bookAvailability is now private and has controlled access.
    private static final boolean[] bookAvailability = {true, true, true, true};

    // SRP: Checks availability without LibraryItem responsibilities.
    public boolean isBookAvailable(int index) {
        if (index >= 0 && index < bookAvailability.length) {
            return bookAvailability[index];
        }
        return false;
    }

    // Encapsulation: Making sure that only this method can modify book availability.
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
