/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamw25_93316_partb;

/**
 *
 * @author bhara
 */
//Encapsulation: Book properties are private with public getters.
//SRP: The Book class now handles individual book properties.
public class Book {
    private String title;
    private boolean available;

    public Book(String title) {
        this.title = title;
        this.available = true;
    }

    public String getTitle() { return title; }

    public boolean isAvailable() { return available; }

    public void borrowBook() { this.available = false; }

    public void returnBook() { this.available = true; }
}
