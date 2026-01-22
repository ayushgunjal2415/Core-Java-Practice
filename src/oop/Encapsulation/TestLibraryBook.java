package oop.Encapsulation;

public class TestLibraryBook {

    public static void main(String[] args) {

        LibraryBook book = new LibraryBook("B101", "Effective Java");

        System.out.println(book.displayBookDetails());

        book.issueBook();   // valid issue
        book.issueBook();   // invalid (already issued)

        System.out.println(book.displayBookDetails());

        book.returnBook();  // valid return
        book.returnBook();  // invalid (already returned)

        System.out.println(book.displayBookDetails());
    }
}

