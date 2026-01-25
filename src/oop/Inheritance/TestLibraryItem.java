package oop.Inheritance;

public class TestLibraryItem {
    public static void main(String[] args) {
        
        Book book = new Book("B101", "James", "1123", "Java Basics");
        Magazine magazine = new Magazine("M-420", "Tech Monthly", "January 2026");

        book.displayDetails();
        book.checkOut();

        magazine.displayDetails();
        magazine.checkOut();
        magazine.returnItem();
    }
}
