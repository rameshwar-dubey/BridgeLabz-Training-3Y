package OOPS_Basic.Level1;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void displayBookDetails() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : " + price);
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayBookDetails();

        System.out.println();

        Book book2 = new Book("The Alchemist", "Paulo Coelho", 499.99);
        book2.displayBookDetails();
    }
}

