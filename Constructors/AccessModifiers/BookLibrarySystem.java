package Constructors.AccessModifiers;

class BookLibrarySystem {
    public String ISBN;
    private String title;
    private String author;

    public BookLibrarySystem(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
}

class EBook extends BookLibrarySystem {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }
    public void showDetails() {
        System.out.println("ISBN: " + ISBN + ", Title: " + getTitle() + ", Author: " + getAuthor());
    }

    public static void main(String[] args) {
        EBook eb = new EBook("978-3-16", "Digital Life", "Vinod");
        eb.showDetails();
        System.out.println("Author: " + eb.getAuthor());
        eb.setAuthor("Suman");
        System.out.println("Updated Author: " + eb.getAuthor());
    }
}

