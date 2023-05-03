import java.util.Date;

public class Movie {
    private int id;
    private String title;
    private String genre;
    private String dirctor;
    private Date releaseDate;
    private boolean isAvailble;


    public Movie(int id, String title, String genre, String dirctor, Date releaseDate) {
        this.dirctor = dirctor;
        this.id = id;
        this.genre = genre;
        this.title = title;
        this.releaseDate = releaseDate;
        isAvailble = true;
    }


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getDirctor() {
        return dirctor;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public boolean isAvailble() {
        return isAvailble;
    }

    public void setAvailble(boolean availble) {
        isAvailble = availble;
    }
}
