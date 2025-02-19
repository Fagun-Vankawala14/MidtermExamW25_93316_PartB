package midtermexamw25_93316_partb;

public class AvailabilityChecking {

    // Applied **Encapsulation**: Made bookAvailability private to restrict direct modification.
    private boolean[] bookAvailability = {true, true, true, true};

    public boolean isBookAvailable(int index) { 
        if (index >= 0 && index < bookAvailability.length) {
            return bookAvailability[index]; 
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