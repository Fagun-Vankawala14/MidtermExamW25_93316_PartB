package midtermexamw25_93316_partb;
//My name is karandeep singh malhari

public class AvailabilityChecking {

    private static boolean[] bookAvailability = {true, true, true, true};

    public boolean isBookAvailable(int index) {
        //Complete this method to check book availability
        return true;
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
