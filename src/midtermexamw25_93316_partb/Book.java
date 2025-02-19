/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamw25_93316_partb;

/**
 *
 * @author ranuj
 */

// Added the Book class
// Encapsulation: Book class has private properties and provides public methods to access them.
// This protects the data and controls how it can be used.
// Cohesion: The Book class is focused only on book-related details, making it easier to understand and work with. 
// Everything about a book is in one place and we can modify and extend the properties anytime.

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
