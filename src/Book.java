import java.util.Date;
import java.util.List;

public class Book extends Item {
    private String author;
    private String publisher;

    public Book(int id, String title, String genre, String author, Date releaseDate, String publisher) {
        super(id, title, genre, releaseDate);
        this.author = author;
        this.publisher = publisher;
        isAvailble = true;
    }

    public String getauthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }
}
