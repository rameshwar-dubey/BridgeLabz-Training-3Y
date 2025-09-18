package Encapsulation;

import java.util.ArrayList;
import java.util.List;

abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;
    private boolean isBorrowed;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public abstract int getLoanDuration();
    public void getItemDetails() {
        System.out.println("Item ID   : " + itemId);
        System.out.println("Title     : " + title);
        System.out.println("Author    : " + author);
        System.out.println("Borrowed? : " + (isBorrowed ? "Yes" : "No"));
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
    }

    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    protected void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}

interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private String borrowerName;

    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 2 weeks
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isBorrowed()) {
            this.borrowerName = borrowerName;
            setBorrowed(true);
            System.out.println(borrowerName + " has reserved the book: " + getTitle());
        } else {
            System.out.println("Book " + getTitle() + " is already borrowed.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isBorrowed();
    }
}

class Magazine extends LibraryItem implements Reservable {
    private String borrowerName;

    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 1 week
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isBorrowed()) {
            this.borrowerName = borrowerName;
            setBorrowed(true);
            System.out.println(borrowerName + " has reserved the magazine: " + getTitle());
        } else {
            System.out.println("Magazine " + getTitle() + " is already borrowed.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isBorrowed();
    }
}

class DVD extends LibraryItem implements Reservable {
    private String borrowerName;

    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // 3 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isBorrowed()) {
            this.borrowerName = borrowerName;
            setBorrowed(true);
            System.out.println(borrowerName + " has reserved the DVD: " + getTitle());
        } else {
            System.out.println("DVD " + getTitle() + " is already borrowed.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isBorrowed();
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        List<LibraryItem> libraryItems = new ArrayList<>();

        Book book1 = new Book(101, "Java Programming", "Ramesh");
        Magazine mag1 = new Magazine(201, "Tech Today", "Anita");
        DVD dvd1 = new DVD(301, "Inception", "Christopher Nolan");

        libraryItems.add(book1);
        libraryItems.add(mag1);
        libraryItems.add(dvd1);

        System.out.println("=== Library Items Details ===\n");
        for (LibraryItem item : libraryItems) {
            item.getItemDetails();
            System.out.println();
        }

        System.out.println("=== Reserving Items ===\n");
        for (LibraryItem item : libraryItems) {
            if (item instanceof Reservable) {
                ((Reservable) item).reserveItem("John Doe");
            }
        }

        System.out.println("\n=== After Reservation ===\n");
        for (LibraryItem item : libraryItems) {
            item.getItemDetails();
            System.out.println();
        }
    }
}

