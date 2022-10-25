package pl.coderslab;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public interface BookService {

    public List<Book> getList();

    public Optional<Book> getBook(Long id);

    public void addBook(Book book);

    public void deleteBook(Long id);

    public void updateBook(Long id, Book book);

}
