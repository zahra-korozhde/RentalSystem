import java.util.Date;
import java.util.List;

public class Movie extends Item {
    private String dirctor;
    private List<String> cast;

    public Movie(int id, String title, String genre, String dirctor, Date releaseDate, List<String> cast) {
        super(id, title, genre, releaseDate);
        this.dirctor = dirctor;
        this.cast = cast;
        isAvailble = true;
    }

    public String getDirctor() {
        return dirctor;
    }

    public List<String> getCast() {
        return cast;
    }
}
