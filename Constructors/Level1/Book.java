package Bridgelabz.oops.Constructors;

class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this.title = "Mathematics Of 11";
        this.author = "RD Sharma";
        this.price = 850.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Atomic Habits", "James Clear", 450.0);
        b1.displayDetails();
        b2.displayDetails();
    }
}
