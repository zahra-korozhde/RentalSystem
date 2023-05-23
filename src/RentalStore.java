import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class RentalStore {
    ArrayList<Item> items = new ArrayList<Item>();
    ArrayList<Customer> customers = new ArrayList<Customer>();
    boolean testt = false;
    boolean test3 = false;


    public void addItem(Item item) {

        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public void register(Customer customer) {
        this.customers.add(customer);


    }

    public ArrayList<Item> getAvailbleItem() {
        ArrayList<Item> availbeItem = items;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).isAvailble() == false) {
                availbeItem.remove(items.get(i));
            }
        }
        return availbeItem;
    }

    public void rentItem(Item item, Customer customer) {
        item.setAvailble(false);
//        this.getAvailbleItem().remove(item);
        int itemId = item.getId();
        int costomerId = customer.getId();
        String s = Integer.toString(costomerId).concat(Integer.toString(itemId));
        int id = Integer.parseInt(s);
        Rental r = new Rental(item, customer, id);
        if (customer.rentals == null){
            customer.rentals = new ArrayList<>();
        }
        customer.rentals.add(r);


    }

    public void returnItem(Rental rental) {
        rental.getCustomer().rentals.remove(rental);
        rental.getItem().setAvailble(true);
        this.getAvailbleItem().add(rental.getItem());

    }

    public Customer getCustomerById(int id) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId() == id) {
                testt = true;
                System.out.println("welcome ! ");
                return customers.get(i);

            } else {
                System.out.println("you are not customer ! ");
            }

        }


        return null;
    }


    public Item getItemById(int id) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == id) {
                test3 = true;
                return items.get(i);
            }
        }
        System.out.println("this is not " +
                "item");

        return null;
    }

}
