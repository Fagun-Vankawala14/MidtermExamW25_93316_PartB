/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamw25_93316_partb;

/**
 *
 * @author Jay patel
 */


// Added the Librarynew class
/*
Encapsulation: The Librarynew class offers public methods (getTitle, getAuthor) to 
access its private properties (title, author). This safeguards the information and limits its use.
*/
    
/*
Cohesion: The Book class is simpler to comprehend and deal with because it solely 
focuses on book-related information. A book has all of its information in one location.
*/

class Librarynew {

    private String title;
    private String author;

    public Librarynew(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}