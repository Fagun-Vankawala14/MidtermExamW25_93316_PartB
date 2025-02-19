package midtermexamw25_93316_partb;
// Encapsulation: Made bookAvailability private to prevent direct modification from outside.
public class AvailabilityChecking {

    private static boolean[] bookAvailability = {true, true, true, true};

    public boolean isBookAvailable(int index) {
        if(index >= 0 && index < bookAvailability.length) {  
        return bookAvailability[index]; 
    }
    return false; 
    }
    private void setBookAvailability(int index, boolean status) {
        if (index >= 0 && index < bookAvailability.length) {
            bookAvailability[index] = status;
    }
}
    //Private setter method ensures controlled modification of bookAvailability
    public void borrowBook(int index) {
        if (isBookAvailable(index)) {
        setBookAvailability(index, false); 
    }
    }
//Private setter method ensures controlled modification of bookAvailability
    public void returnBook(int index) {
//        if (index >= 0 && index < bookAvailability.length) {
//            bookAvailability[index] = true;
//        }
        setBookAvailability(index, true);
    }
}
