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
    public void rentMovie(Movie movie , Customer customer){
        movie.setAvailble(false) ;
        this.getAvailbleMovie().remove(movie);
        int movieId = movie.getId();
        int costomerId = customer.getId();
        String s = Integer.toString(costomerId).concat(Integer.toString(movieId));
        int id = Integer.parseInt(s);
        Rental r  = new Rental(movie ,customer ,id);
        customer.rentals.add(r);


    }
    public void returnMovie( Rental rental){
        rental.getCustomer().rentals.remove(rental);
        rental.getMovie().setAvailble(true);
        this.getAvailbleMovie().add(rental.getMovie());

    }
    public Customer getCustomerById( int id ){
        for (int i = 0; i <customers.size() ; i++) {
            if (customers.get(i).getId() == id)
                return customers.get(i);
        }
        System.out.println("You are mot customer! go out!");
        return null;
    }
}
