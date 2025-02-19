package midtermexamw25_93316_partb;

public class AvailabilityChecking {

    private static boolean[] bookAvailability = {true, true, true, true};

    public boolean isBookAvailable(int index) {
        //Complete this method to check book availability
        if(index >= 0 && index < bookAvailability.length)
        {
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
