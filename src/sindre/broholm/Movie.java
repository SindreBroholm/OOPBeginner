package sindre.broholm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Movie implements Product, Comparable<Movie> {
    private String title;
    private MovieGenre genre = MovieGenre.notSet;
    protected int price = -1;
    protected long productId = -1;


    public int getPrice() {
        return price;
    }

    public long getProductId() {
        return productId;
    }


    @Override
    public String toString() {
        String toString = ("Title: " + title + "\n" + "Genre: " + genre + "\n" + "Price: " + price + "\n" + "Product Id: " + productId);
        return toString;
    }

    public Movie(String title, int price, long productId) {
        this.title = title;
        this.productId = productId;
        this.price = price;
    }

    public Movie(String title, int price, long productId, MovieGenre genre) {
        this(title, price, productId);
        this.genre = genre;
    }

    @Override
    public void printDetails() {
        System.out.println("----------Movie----------");
        if (!(title.isEmpty())) {
            System.out.println("Title: " + title);
        } else {
            System.out.println("Title: Not set!");
        }
        if (!(genre.equals(MovieGenre.notSet))) {
            System.out.println("Genre: " + genre);
        } else {
            System.out.println("Genre: Not set!");
        }
        if (!(getPrice() == -1)) {
            System.out.println("Price: " + price + ",- kr");
        } else {
            System.out.println("Price: not set!");
        }
        if (!(getProductId() == -1)) {
            System.out.println("Product ID: " + productId);
        } else {
            System.out.println("Product ID: Not set!");
        }

    }

    @Override
    public int compareTo(Movie movie) {
        int temp;
        if(getProductId() > movie.getProductId()){
            temp= 1;
        } else if (getProductId() == movie.getProductId()){
            temp= 0;
        }else{
            temp = -1;
        }
        return temp;
    }


    public String findProductById(long inputFromUser, List<Product> products){
        String temp = null;
        for (Product prod: products) {
            if(getProductId() == inputFromUser){
                temp = ("FOUND THIS PRODUCT: \n" + prod.toString());
                return temp;

            }
        }
        temp = "No item found";
        return temp;
    }
}
