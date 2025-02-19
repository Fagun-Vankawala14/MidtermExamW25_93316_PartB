/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamw25_93316_partb;

/**
 *
 * @author user
 */
// Two principals of object oriented design are ; High cohesion and loose coupling 
public class Catalog {
    
    private static String[]books = {"The Great Gatsby", "1984", "To Kill a Mockingbird", "The Catcher in the Rye"};
    
    public String getBookName( int index){
        
        return (index >=0 && index < books.length)? books[index]: null;
        
    }
    
    public int getTotalBooks(){
    return books.length;
    }
}
