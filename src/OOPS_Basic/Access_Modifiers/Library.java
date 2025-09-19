package OOPS_Basic.Access_Modifiers;

class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void displayBookDetails() {
        System.out.println("ISBN  : " + ISBN);
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends Book {
    private String fileFormat;

    public EBook(String ISBN, String title, String author, String fileFormat) {
        super(ISBN, title, author);
        this.fileFormat = fileFormat;
    }

    public void displayEBookDetails() {
        System.out.println("ISBN      : " + ISBN);
        System.out.println("Title     : " + title);
        System.out.println("Author    : " + getAuthor());
        System.out.println("FileFormat: " + fileFormat);
    }
}

public class Library {
    public static void main(String[] args) {
        Book b1 = new Book("123-4567890123", "Java Programming", "Paulo Coelho");
        b1.displayBookDetails();
        System.out.println();
        b1.setAuthor("Ramesh Dubey");
        System.out.println("Updated Author: " + b1.getAuthor());
        System.out.println();

        EBook e1 = new EBook("987-6543210987", "Python Programming", "Sita Sharma", "PDF");
        e1.displayEBookDetails();
    }
}

