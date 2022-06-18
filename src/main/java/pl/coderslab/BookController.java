package pl.coderslab;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    MockBookService mockBookService;

    public BookController(MockBookService mockBookService) {
        this.mockBookService = mockBookService;
    }

    @GetMapping("/books")
    public List<Book> showAllBooks() {
        return mockBookService.getList();
    }

    @PostMapping("/books")
    public void addBook(@RequestBody Book book){
        mockBookService.addBook(book);
    }

}
