// // Create a class hierarchy for a Library System. Implement a base class Item with properties like title, author, and publicationYear. 
// Derive two classes, Book and Magazine, from the Item class. Each derived class should have additional properties such as genre 
// for books and issueNumber for magazines. Write methods in each class to display their details. 
// // Demonstrate the use of inheritance by creating objects of both classes and calling their respective methods.
import java.util.*;
class Item{
    String title;
    String author;
    int py;
    Item(String title, String author, int py)
    {
        this.title = title;
        this.author = author;
        this.py=py;
    }
    void displayDetails()
    {
        System.out.println(title);
        System.out.println(author);
        System.out.println(py);
    }
}
class Book extends Item
{
    String type;
    Book(String title, String author, int py, String type)
    {
        super(title,author,py);
        this.type=type;
    }
    void displayDetails()
    {
        super.displayDetails();
        System.out.println(type);
    }
}
class Magazine extends Item{
    int issuenum;
    Magazine(String title, String author, int py, int issuenum){
        super(title, author, py);
        this.issuenum=issuenum;
    }
    void displayDetails(){
        super.displayDetails();
    System.out.println(issuenum);    }

}
public class LibrarySystem {
    public static void main(String[] args)
    {
        Book book = new Book("Her Last Wish","Ajay",2016,"Fiction");
        Magazine magazine=new Magazine("It starts With us","Colleen",2016,18);
        System.out.println("Book Details: ");
        book.displayDetails();
        System.out.println("Magazine Details: ");
        magazine.displayDetails();

    }
}
