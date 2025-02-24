package bookstore;

public class BookService {
    public static void main(String[] args) {
        Book myBook = new Novel(); // Using interface reference
        myBook.setTitle("Harrypotter and the Philosopher's Stone");
        myBook.setAuthor("J.K Rowling");
        myBook.displayDetails();
    }
}
