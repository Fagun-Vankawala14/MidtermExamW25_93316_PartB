package midtermexamw25_93316_partb;

public class AvailabilityChecking {
    private static final boolean[] bookAvailability = {true, true, true, true};

    // Encapsulation: bookAvailability is private, accessed through a method
    public boolean isBookAvailable(int index) {
        return index >= 0 && index < bookAvailability.length && bookAvailability[index];
    }

    // SRP: AvailabilityChecking class now fully handles borrowing logic
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
