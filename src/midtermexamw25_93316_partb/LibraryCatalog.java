/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamw25_93316_partb;

/**
 *
 * @author lakshit
 */
/**Single Responsibility Principle (SRP):**
     * - This method is responsible **only** for displaying the book catalog.
     * - It does not handle book borrowing or returning 
     */
public class LibraryCatalog {
     private static String[] books = {"The Great Gatsby", "1984", "To Kill a Mockingbird", "The Catcher in the Rye"};
  

    public void displayCatalog() {
        System.out.println("Welcome to the library! Here is a list of available books:");
        for (int i = 0; i < books.length; i++) {  
        System.out.println((i + 1) + ". " + books[i]);
    }
    }
   
}

