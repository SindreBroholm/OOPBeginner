package sindre.broholm;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static sindre.broholm.MovieGenre.*;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Book("Sindre Sæther", "How to OOP in java", 599, 12));
        products.add(new Book("Fredrik", "How OOP really works in java", 699, 13));
        products.add(new ChildrensBook("Playing with fire", "Pyro Man", 666, 15, "From 3 years"));
        products.add(new MovieWithDirector("Up", 299, 123, DRAMA, "Sindre Broholm"));
        products.add(new MovieWithDirector("Under", 299, 124, DRAMA, "Sindre Broholm"));
        products.add(new Movie("Left", 299, 125, DRAMA));
        products.add(new Movie("Right", 299, 126, DRAMA));

        for (Product product : products) {
            product.printDetails();
        }

/*        for (Product prod :
                products) {
            System.out.println(prod.findProductById(13, products));
            break;
        }*/


    }
}
