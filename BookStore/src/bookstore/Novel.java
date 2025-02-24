package bookstore;

public class Novel implements Book { // Novel is a class, not an interface
    private String title;
    private String author;

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void displayDetails() {
        System.out.println("Novel Title: " + title);
        System.out.println("Author: " + author);
    }
}

