


import java.util.*;
        public class Main {
            public static void main(String[] args) {

                List<String> c = new ArrayList<String>(Arrays.asList("vd","dcas"));
                Movie movie1 = new Movie(5,"dd","ads","asdf",new Date(),c);
                Game game = new Game(7,"dd","ads","jyadfs",new Date(),"wefac");
                Book book= new Book(7,"dd","ads","jyadfs",new Date(),"wefac");
                Customer customer1 = new Customer("dSA","SAC","354","DSA",58);
                Item item = new Item(8,"ff" ,"uu" ,new Date());
                Rental rental = new Rental(movie1,customer1,107);
                RentalStore rentalStore = new RentalStore();
                rentalStore.register(customer1);
                rentalStore.addItem(movie1);
                rentalStore.addItem(game);
                rentalStore.addItem(book);
                rentalStore.getCustomerById(58);
                rentalStore.getItemById(7);
                rentalStore.getAvailbleItem();
                rentalStore.rentItem(movie1,customer1);
                rentalStore.returnItem(new Rental(movie1,customer1,565));
            }
        }

