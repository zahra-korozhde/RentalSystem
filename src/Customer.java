import java.util.ArrayList;

public class Customer {
    private int id;
    private String name;
    private String address;
    private String phone;
    private String email;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    ArrayList<Rental> rentals = new ArrayList<Rental>();

    public Customer(String name, String address, String phone, String email, int id) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
}
