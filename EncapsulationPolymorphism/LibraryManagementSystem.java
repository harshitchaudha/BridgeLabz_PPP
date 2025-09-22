// Interface: Reservable
interface Reservable {
    void reserveItem(String borrower);
    boolean checkAvailability();
}

// Abstract Class: LibraryItem
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private boolean isReserved = false;
    private String borrower;

    // Constructor
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Encapsulation: Getters
    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    // Secure borrower details
    protected void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    protected String getBorrower() {
        return borrower;
    }

    protected void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    protected boolean isReserved() {
        return isReserved;
    }

    // Abstract Method
    public abstract int getLoanDuration();

    // Concrete Method
    public void getItemDetails() {
        System.out.println("ID: " + itemId + 
                           ", Title: " + title + 
                           ", Author: " + author + 
                           ", Loan Duration: " + getLoanDuration() + " days");
    }
}

// Subclass: Book
class Book extends LibraryItem implements Reservable {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 2 weeks
    }

    @Override
    public void reserveItem(String borrower) {
        if (!isReserved()) {
            setReserved(true);
            setBorrower(borrower);
            System.out.println("Book reserved by " + borrower);
        } else {
            System.out.println("Book already reserved!");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}

// Subclass: Magazine
class Magazine extends LibraryItem implements Reservable {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 1 week
    }

    @Override
    public void reserveItem(String borrower) {
        if (!isReserved()) {
            setReserved(true);
            setBorrower(borrower);
            System.out.println("Magazine reserved by " + borrower);
        } else {
            System.out.println("Magazine already reserved!");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}

// Subclass: DVD
class DVD extends LibraryItem implements Reservable {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // 3 days
    }

    @Override
    public void reserveItem(String borrower) {
        if (!isReserved()) {
            setReserved(true);
            setBorrower(borrower);
            System.out.println("DVD reserved by " + borrower);
        } else {
            System.out.println("DVD already reserved!");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}

// Main Class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem item1 = new Book("B101", "Java Programming", "James Gosling");
        LibraryItem item2 = new Magazine("M202", "Tech Today", "Editorial Team");
        LibraryItem item3 = new DVD("D303", "Inception", "Christopher Nolan");

        LibraryItem[] items = {item1, item2, item3};

        // Polymorphism
        for (LibraryItem item : items) {
            item.getItemDetails();
            Reservable res = (Reservable) item;
            System.out.println("Available? " + res.checkAvailability());
            res.reserveItem("Alice");
            System.out.println("Available after reservation? " + res.checkAvailability());
            System.out.println("---------------------------------");
        }
    }
}
