package oop.Inheritance;

public class Book extends LibraryItem{
    private String isbn;
    private String author;

    public Book(String isbn, String author, String itemID, String title) {
        super(itemID, title);  // calls parent class contructor
        this.isbn = isbn;      
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void displayDetails(){
        System.out.println(
            "Book -> Title: " + getTitle() +
            ", Author: " + getAuthor() +
            ", ISBN: " + getIsbn()
        );
    }

}
