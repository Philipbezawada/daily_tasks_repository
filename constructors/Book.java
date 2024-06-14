/*Create a Java class Book with a parameterized constructor that initializes title, author,
 *  and isbn. Create an object of this class and print its details.
 */



package constructors;
public class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void main(String[] args) {
        Book book = new Book("1984", "George Orwell", "1234567890");
        System.out.println("Title: " + book.title);
        System.out.println("Author: " + book.author);
        System.out.println("ISBN: " + book.isbn);
    }
}
