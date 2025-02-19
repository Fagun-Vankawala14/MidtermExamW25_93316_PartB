/*Editor : Dong Nguyen 
  991756472
*/

package midtermexamw25_93316_partb;

public class AvailabilityChecking {
    protected static boolean[] bookAvailability = {true, true, true, true};

    public boolean isBookAvailable(int index) {
        if (index >= 0 && index < bookAvailability.length) {
            return bookAvailability[index];
        }
        return false;
    }

    // OCP: We are keeping the original class unchanged but allowing extension.
    public static String getBookAvailability(int index) {
        return (index >= 0 && index < bookAvailability.length && bookAvailability[index]) ? "Available" : "Not Available";
    }
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
