
import java.util.Date;

public class Rental {

    private int id ;
    Movie movie = new Movie();

    Customer customer = new Customer();
    private Date rentalDate;
    private Date returnDate;

    public Rental( Movie movie , Customer customer , int id){
        this.id = id;
        this.movie = movie;
        this.customer = customer;
    }



    public int getId() {
        return id;
    }

    public Movie getMovie() {
        return movie;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

}
