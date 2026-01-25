package oop.Inheritance;

 class LibraryItem {

    private String itemId;
    private String title; 

    public LibraryItem(String itemId, String title) {
        this.itemId = itemId;
        this.title = title;
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public void checkOut(){
         System.out.println(title + " has been checked out");
    }

    public void returnItem(){
        System.out.println(title + " has been returned");
    }

    public void displayDetails(){
        System.out.println("Title: " + title + "ItemId: " + itemId);
    }

}
