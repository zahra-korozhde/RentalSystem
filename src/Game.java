import java.util.Date;
import java.util.List;

public class Game extends Item {
    private String platform;
    private String publisher;

    public Game(int id, String title, String genre, String platform, Date releaseDate, String publisher) {
        super(id, title, genre, releaseDate);
        this.platform = platform;
        this.publisher = publisher;
        isAvailble = true;
    }

    public String getPlatform() {
        return platform;
    }

    public String getPublisher() {
        return publisher;
    }
}
