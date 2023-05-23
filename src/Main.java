//
//
//
//import java.util.*;
//        public class Main {
//            public static void main(String[] args) {
//
//                String c = "liyg";
//                Movie movie1 = new Movie(5,"dd","ads","asdf",new Date(),c);
//                Game game = new Game(7,"dd","ads","jyadfs",new Date(),"wefac");
//                Book book= new Book(7,"dd","ads","jyadfs",new Date(),"wefac");
//                Customer customer1 = new Customer("dSA","SAC","354","DSA",78);
//                Item item = new Item(6,"ff" ,"uu" ,new Date());
//                Rental rental = new Rental(movie1,customer1,107);
//                RentalStore rentalStore = new RentalStore();
//                rentalStore.register(customer1);
//                rentalStore.addItem(movie1);
//                rentalStore.addItem(game);
//                rentalStore.addItem(book);
//                rentalStore.getCustomerById(58);
//                rentalStore.getItemById(9);
//                rentalStore.getAvailbleItem();
//                rentalStore.rentItem(movie1,customer1);
//                rentalStore.returnItem(new Rental(movie1,customer1,565));
//            }
//        }
//

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.reflect.TypeToken;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        Reader reader = new FileReader("D:\\java code\\RwntalSystem\\TestYourFork.json");
        Moduls ML = gson.fromJson(reader, new TypeToken<Moduls>() {
        }.getType());
        reader.close();

        Customer first = ML.customers.get(0);
        Customer secound= ML.customers.get(1);
        Customer third = ML.customers.get(2);

        RentalStore bookStore = new RentalStore();
        for (Item b:ML.books) {
            bookStore.addItem(b);
        }
        RentalStore gameStore = new RentalStore();
        for (Item g:ML.games) {
            gameStore.addItem(g);
        }

        Book book1 = (Book) bookStore.getItemById(3);
        Book book2 = (Book) bookStore.getItemById(6);
        bookStore.rentItem(book1, first);
        bookStore.rentItem(book2, first);

        Book book3 = (Book) bookStore.getItemById(1);
        Book book4 = (Book) bookStore.getItemById(7);
        bookStore.rentItem(book3, secound);
        bookStore.rentItem(book4, secound);

        Book book5 = (Book) bookStore.getItemById(9);
        Game game = (Game) gameStore.getItemById(4);
        bookStore.rentItem(book5, third);
        gameStore.rentItem(game, third);

        Gson writing = new Gson();
        String json = writing.toJson(ML);
        String path = "D:\\java code\\RwntalSystem\\TestYourFork.json";
        try {
            FileWriter writer = new FileWriter(path);
            writer.write(json);
            writer.close();
        } catch (IOException | JsonIOException e) {
            throw new RuntimeException(e);
        }
    }
}
