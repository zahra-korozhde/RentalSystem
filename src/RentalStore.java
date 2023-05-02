import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class RentalStore {
    ArrayList<Movie> movies;
    ArrayList<Customer> customers;

    public void addMovie(Movie movie){
        Scanner s = new Scanner(System.in);
        System.out.println("enter title of move : ");
        String name = s.next();
        int foundIdx = -1;
        for (int i = 1; i < movies.size(); i++)
        {
            if (movies.get(i).getTitle() == name )
            {
                foundIdx = i;
                break;
            }
        }

        movies.add(movies.retainAll() + foundIdx);
    }
}
