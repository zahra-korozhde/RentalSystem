import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class RentalStore {
    ArrayList<Movie> movies = new ArrayList<Movie>();
    ArrayList<Customer> customers = new ArrayList<Customer>();


    public void addMovie(Movie movie) {

        this.movies.add(movie);
    }

    public void removeMovie(Movie movie) {
        this.movies.remove(movie);
    }

    public void register(Customer customer) {
        this.customers.add(customer);


    }

    public ArrayList<Movie> getAvailbleMovie() {
        ArrayList<Movie> availbeMovie = movies;
        for(int i = 0 ; i < movies.size() ; i++){
            if(movies.get(i).isAvailble() == false){
                availbeMovie.remove(movies.get(i));
            }
        }
        return availbeMovie;
    }

}
