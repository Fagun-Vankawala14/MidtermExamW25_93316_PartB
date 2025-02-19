package midtermexamw25_93316_partb;

public class AvailabilityChecking {
    //Encapsulation takes place here (encapsulation means hiding of data inside class) so here we make bookAvailability private. 

    private static boolean[] bookAvailability = {true, true, true, true};
    //here we have a controlled method which helps in checking the availability
    public boolean isBookAvailable(int index) {
        if (index >= 0 && index < bookAvailability.length) {
            return bookAvailability[index];
        }
        return true;
    }

    public void borrowBook(int index) {
        if (isBookAvailable(index)) {
            bookAvailability[index] = false;
        }
    }
   // returning the book 
    public void returnBook(int index) {
        if (index >= 0 && index < bookAvailability.length) {
            bookAvailability[index] = true;
        }
    }
}
