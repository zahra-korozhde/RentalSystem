import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class RentalStore {
    ArrayList<Movie> movies;
    ArrayList<Customer> customers;
    Customer customer;

    public void addMovie(Movie movie){

        movies.add(movie);
    }
    public void removeMovie(Movie movie){
        movies.remove(movie);
    }
    public void register( Customer customer){
         Scanner scanner = new Scanner(System.in);
        System.out.println("enter your id : ");
         int id = scanner.nextInt();


    }

}
