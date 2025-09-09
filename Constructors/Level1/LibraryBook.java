package Bridgelabz.oops.Constructors;

class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    public LibraryBook(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    public void display() {
        System.out.println(title + " by " + author + " | Available: " + isAvailable);
    }

    public static void main(String[] args) {
        LibraryBook lb1 = new LibraryBook("Java Basics", "Herbert Schildt", 600.0, true);
        lb1.display();
        System.out.println("Borrowing book: " + lb1.borrowBook());
        lb1.display();
        System.out.println("Trying to borrow again: " + lb1.borrowBook());
    }
}

