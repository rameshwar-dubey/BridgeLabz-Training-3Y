import java.util.*;
class Book{
    private String author;
    private String title;

    public Book(String author, String title){
        this.author=author;
        this.title=title;
    }
    public String gettitle(){
        return title;
    }
    public String getauthor(){
        return author;
    }
    public void display(){
        System.out.println("Book: " + title + " And Author: " + author);
    }
}

class Library{
    private String name;
    private ArrayList<Book> books;
    public Library(String name){
        this.name=name;
        this.books=new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }
    public void displayLibrary(){
        System.out.println("\nlibrary : "+name);
        System.out.println("Books in the library");
        for(Book b : books){
            b.display();
        }
    }
}

public class Aggregation {
    public static void main(String[] args){
        Book b1=new Book("JK Rowlling","HarryPotter");
        Book b2=new Book("Leo Tolstoy","War And Peace");
        Book b3=new Book("James Clear","Atomic Habbits");

        Library CentralLib=new Library("Central Library");
        Library AncientLib=new Library("Ancient Library");

        CentralLib.addBook(b1);
        CentralLib.addBook(b2);
        AncientLib.addBook(b1);
        AncientLib.addBook(b3);

        CentralLib.displayLibrary();
        AncientLib.displayLibrary();
    }
}
