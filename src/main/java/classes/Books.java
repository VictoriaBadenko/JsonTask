package classes;

public class Books {
    private String author;
    private String bookTitle;

    public Books() {
    }

    public Books(String author, String bookTitle) {
        this.author = author;
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books that = (Books) o;
        return author.equals(that.author) &&
                bookTitle.equals(that.bookTitle);
    }
}
