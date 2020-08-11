package sindre.broholm;


import static sindre.broholm.MovieGenre.*;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.author = "Sindre Sæther";
        book1.title = "How to OOP in java part 1";
        book1.price = 999;

        Book book2 = new Book();
        book2.author = "Ingvild";
        book2.title = "How to OOP in java part 2";
        book2.price = 991;

        /*printBookDetails(book1);
        printBookDetails(book2);*/

        Movie movie1 = new Movie();
        movie1.Title = "How to avoid Mooses";
        movie1.Genre = DOCUMENTARY;
        movie1.Price = 350;

        Movie movie2 = new Movie();
        movie2.Title = "Two tomatoes one bottle";
        movie2.Genre = ACTION;
        movie2.Price = 399;

        Book[] books = new Book[2];
        books[0] = new Book();
        books[0].title = "Elevator talk 123";
        books[0].author = "Stian";
        books[0].price = 312;
        books[1] = new Book();
        books[1].title = "how to fill a bottle with water";
        books[1].author = "Susan spring";
        books[1].price = 202;

/*        printMovieDetails(movie1);
        printMovieDetails(movie2);*/
       /* for (Book book : books) {
            printBookDetails(book);
        }*/


        Movie[] movies = new Movie[2];
        movies[0] = new Movie();
        movies[0].Title = "Eagle invasion";
        movies[0].Genre = COMEDY;
        movies[0].Price = 299;
        movies[1] = new Movie();
        movies[1].Title = "The rise of the Worms";
        movies[1].Genre = DRAMA;
        movies[1].Price = 399;

        /*for (int i = 0; i < movies.length; i++) {
            printMovieDetails(movies[i]);
        }*/
    }


    public static void printBookDetails(Book book) {
        System.out.printf("Title: %s%nAuthor: %s%nPrice: %d,-kr%n%n", book.title, book.author, book.price);
    }

    public static void printMovieDetails(Movie movie) {
        System.out.printf("Title: %s%nGenre: %s%nPrice: %d,-kr%n%n", movie.Title, movie.Genre, movie.Price);
    }
}
