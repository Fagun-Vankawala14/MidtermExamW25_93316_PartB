//Author Gourav
//Studen Id 991775050




package midtermexamw25_93316_partb;

public class AvailabilityChecking {


    private static boolean[] bookAvailability = {true, true, true, true};

    
    //SRP= This method is responsible for checking book availability.
    public boolean isBookAvailable(int index) {
        return index >= 0 && index < bookAvailability.length && bookAvailability[index];
    }
    
     //SRP= This method is responsible for borrowing book and updating availability.
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
