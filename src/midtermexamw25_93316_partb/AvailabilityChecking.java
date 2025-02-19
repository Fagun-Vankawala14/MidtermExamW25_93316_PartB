package midtermexamw25_93316_partb;

public class AvailabilityChecking {

    private static boolean[] bookAvailability = {true, true, true, true};

    public boolean isBookAvailable(int index) {
        
    return bookAvailability[index]; // Returns true if book is available, false if borrowed

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
