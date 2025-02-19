package midtermexamw25_93316_partb;

/*
Author: jay Patel
 */


public class AvailabilityChecking {

    // Encapsulation: 'bookAvailability' is private, so outside classes must call
    private static boolean[] bookAvailability = {true, true, true, true};

    // check the availability of the book
    public boolean isBookAvailable(int index) {
        //Complete this method to check book availability
        // SRP: This method simply checks availability of book, no UI or other responsibilities.
        if (index >= 0 && index < bookAvailability.length) {
            return bookAvailability[index];
        }
        return true;
    }

    // borrow Book 
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
