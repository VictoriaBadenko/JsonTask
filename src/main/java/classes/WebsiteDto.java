package classes;

import java.util.List;

public class WebsiteDto {
    private Long id;
    public List<BookDto> bookDtos;

    public WebsiteDto() {
    }

    public WebsiteDto(List<BookDto> bookDtos, Long id) {
        this.bookDtos = bookDtos;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List getBooks() {
        return bookDtos;
    }

    public void setBooks(List<BookDto> books) {
        this.bookDtos = books;
    }
}
