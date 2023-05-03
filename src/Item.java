import java.util.Date;

public class Item {
    protected int id;
    protected String title;
    protected String genre;
    protected Date releaseDate;
    protected boolean isAvailble;


    public Item(int id, String title, String genre, Date releaseDate) {
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
