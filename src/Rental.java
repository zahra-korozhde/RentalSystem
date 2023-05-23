import java.util.Date;

public class Rental {

    private int id ;
    Item item ;

    Customer customer ;
    private Date rentalDate;
    private Date returnDate;

    public Rental( Item item , Customer customer , int id){
        this.id = id;
        this.item = item;
        this.customer = new Customer(customer.getName(),customer.getAddress(),customer.getPhone(),customer.getEmail(),customer.getId());
    }



    public int getId() {
        return id;
    }

    public Item getItem() {
        return item;
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
