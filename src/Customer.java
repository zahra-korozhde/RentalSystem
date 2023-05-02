import java.util.ArrayList;

public class Customer {
    private int id;
    private String name;
    private String address;
    private String phone;
    private String email;
    ArrayList<Rental> rentals;

    public Customer(String name, String address, String phone, String email, int id) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
}
