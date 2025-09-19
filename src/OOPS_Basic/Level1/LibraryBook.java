package OOPS_Basic.Level1;

public class LibraryBook {

    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    public LibraryBook() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        this.isAvailable = true;
    }

    public LibraryBook(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public void borrow() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently not available.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("You have returned: " + title);
    }

    public void display() {
        System.out.println("Title       : " + title);
        System.out.println("Author      : " + author);
        System.out.println("Price       : " + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("The Alchemist", "Paulo Coelho", 499.99, true);
        book1.display();

        System.out.println();
        book1.borrow();
        book1.display();

        System.out.println();
        book1.borrow();

        System.out.println();
        book1.returnBook();
        book1.display();
    }
}

