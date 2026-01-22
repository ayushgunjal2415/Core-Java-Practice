package oop.Encapsulation;

 class LibraryBook {
    private String bookId;
    private String title;
    private boolean isIssued;

    public LibraryBook(String bookId, String title) {
        this.bookId = bookId;
        this.title = title;
        this.isIssued = false; //default: not issued
    }

    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public boolean isIssued() {
        return isIssued;
    }

    // Issue book logic
    public void issueBook() {
        if (isIssued) {
            System.out.println("Book is already issued.");
        } else {
            isIssued = true;
            System.out.println("Book issued successfully.");
        }
    }

    // Return book logic
    public void returnBook() {
        if (!isIssued) {
            System.out.println("Book is not issued.");
        } else {
            isIssued = false;
            System.out.println("Book returned successfully.");
        }
    }
    
    // Display method
    public String displayBookDetails() {
        return "Book ID: " + bookId +
               ", Title: " + title +
               ", Issued: " + isIssued;
    }
    
}
