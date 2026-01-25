package oop.Inheritance;

public class Magazine extends LibraryItem{

    private String issueNumber;

    public Magazine(String itemId, String title, String issueNumber) {
        super(itemId, title);  //calls parent class constructor
        this.issueNumber = issueNumber;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    @Override
    public void displayDetails(){
        System.out.println( 
            "Magazine -> Title: " + getTitle() +
            ", Issue: " + getIssueNumber()
        );
    }

    
}
