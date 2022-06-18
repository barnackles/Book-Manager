package pl.coderslab;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MockBookService {
    private List<Book> list;
    private static Long nextId = 4L;


    public MockBookService() {
        this.list = new ArrayList<>();
        list.add(new Book(1L, "9788324631766", "Thiniking	in	Java", "Bruce	Eckel", "Helion", "programming"));
        list.add(new Book(2L, "9788324627738", "Rusz	glowa	Java.", "Sierra	Kathy,	Bates	Bert", "Helion",
                "programming"));
        list.add(new Book(3L, "9780130819338", "Java	2.	Podstawy", "Cay	Horstmann,	Gary	Cornell", "Helion",
                "programming"));
    }
    public List<Book> getList() {
        return list;
    }

    public void addBook(Book book) {
        book.setId(nextId);
        list.add(book);
        nextId++;
    }

    public void deleteBook(Long id) {
        list = list.stream().
                filter(t -> !id.equals(t.getId()))
                .collect(Collectors.toList());
    }

    public void updateBook(Long id, Book book) {

        Long idFromList = -1L;
        int index = -1;

        for (Book b : list ) {
            if (id.equals(b.getId())) {
                index = list.indexOf(b);
                idFromList = b.getId();
            }
        }
        book.setId(idFromList);
        list.set(index, book);
    }
}
