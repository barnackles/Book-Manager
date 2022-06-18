package pl.coderslab;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

   BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public List<Book> showAllBooks() {
        return bookService.getList();
    }

    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookService.getBook(id);
    }

    @PostMapping("/books")
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }

    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable Long id){
        bookService.deleteBook(id);
    }

    @PutMapping("/books/{id}")
    public void deleteBook(@PathVariable Long id, @RequestBody Book book){
        bookService.updateBook(id, book);
    }

}
