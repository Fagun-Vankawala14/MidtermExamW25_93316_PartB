/*Editor : Mir Ali
991588037
*/
/**
 * AvailabilityChecking class implements the Single Responsibility Principle
 * by focusing solely on managing the availability status of books.
 * 
 * Responsibility: Managing and tracking the availability status of books
 * in the library system.
 */
package midtermexamw25_93316_partb;

public class AvailabilityChecking {

    private static boolean[] bookAvailability = { true, true, true, true };

    public boolean isBookAvailable(int index) {
        if (index >= 0 && index < bookAvailability.length) {
            return bookAvailability[index];
        }
        return false; // If index is out of range, return false
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
