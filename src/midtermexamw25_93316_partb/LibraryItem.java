package midtermexamw25_93316_partb;

import java.util.Scanner;

public class LibraryItem {

//    We used Single Responsible principle from SOLID here 
//    and removed the unnecessary methods which were not needed in the main method 
//    and kept the main method clean and empty thus we also dont need to have instance of main method now.

    public static void main(String[] args) {
        Books books = new Books();
        
        Scanner sc = new Scanner(System.in);
            
        boolean continueBorrowing = true;

        while (continueBorrowing) {
            books.displayCatalog();
            books.selectBook(sc);

            System.out.print("\nWould you like to borrow another book? (yes/no): ");
            String response = sc.next().trim().toLowerCase();
            continueBorrowing = response.equals("yes");
        }

        System.out.println("Thank you for using the library!");
        sc.close();
    }
}
