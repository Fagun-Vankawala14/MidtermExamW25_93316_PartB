package midtermexamw25_93316_partb;
/**
 * @author Ayushi Goswami
 * StudentID: 991752568
 email:goswamay@sheridancollege.ca
 date:2025/02/19

 */
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
