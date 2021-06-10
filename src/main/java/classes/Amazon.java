package classes;

import java.util.List;

public class Amazon {
    private Long id;
    private List<Books> books;

    public Amazon() {
    }

    public Amazon(List books, Long id) {
        this.books = books;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List getBooks() {
        return books;
    }

    public void setBooks(List<Books> books) {
        this.books = books;
    }
}
