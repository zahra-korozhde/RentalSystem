import java.util.*;
public class Main {
    public static void main(String[] args) {

        Movie movie1 = new Movie(5,"dd","ads","asdf",new Date());
        Movie movie2 = new Movie(7,"dd","ads","jyadfs",new Date());
        Customer customer1 = new Customer("dSA","SAC","354","DSA",56);
        Customer customer2 = new Customer("dSA","SDAC","354","DSA",68);
        Rental rental = new Rental(movie1,customer1,453);
        RentalStore rentalStore = new RentalStore();
        rentalStore.register(customer1);
        rentalStore.addMovie(movie1);
        rentalStore.addMovie(movie2);
        rentalStore.getCustomerById(56);
        rentalStore.getCustomerById(68);
        rentalStore.getMovieById(7);
        rentalStore.getAvailbleMovie();
        rentalStore.rentMovie(movie1,customer1);
        rentalStore.returnMovie(new Rental(movie1,customer1,565));
    }
}