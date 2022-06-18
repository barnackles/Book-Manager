package pl.coderslab;


public class Book {

    private Long id;
    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private String category;

    public Book(Long id, String isbn, String title, String author, String publisher, String category) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.category = category;
    }
}
