package Constructors;

public class LibraryBookSystem {
    String title;
    String author;
    double price;
    boolean available;

    public LibraryBookSystem(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }
    public boolean borrow() {
        if (available) {
            available = false;
            return true;
        }
        return false;
    }
    public void display() {
        System.out.println("Title: " + title + ", Available: " + available);
    }
    public static void main(String[] args) {
        LibraryBookSystem book = new LibraryBookSystem("The Alchemist", "Paulo Coelho", 400.0, true);
        book.display();
        System.out.println("Borrow attempt: " + book.borrow());
        book.display();
        System.out.println("Borrow attempt: " + book.borrow());
    }
}
