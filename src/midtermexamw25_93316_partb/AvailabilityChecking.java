package midtermexamw25_93316_partb;

public class AvailabilityChecking {

    private static boolean[] bookAvailability = {true, true, true, true};

    public boolean isBookAvailable(int index) {
        // Check if the index is within the valid range
        if (index >= 0 && index < bookAvailability.length) {
            return bookAvailability[index]; 
        }
        return false; 
    }

    public void borrowBook(int index) {
        if (isBookAvailable(index)) { // Check availability before borrowing
            bookAvailability[index] = false;
            System.out.println("Book at index " + index + " has been borrowed.");
        } else {
            System.out.println("Book at index " + index + " is not available.");
        }
    }

    public void returnBook(int index) {
        if (index >= 0 && index < bookAvailability.length) {
            bookAvailability[index] = true;
            System.out.println("Book at index " + index + " has been returned.");
        } else {
            System.out.println("Invalid book index.");
        }
    }
}
