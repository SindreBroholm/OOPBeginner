package sindre.broholm;

public class MovieWithDirector extends Movie{
    private String director;

    public MovieWithDirector(String title, int price, long productId, MovieGenre genre, String director) {
        super(title, price, productId, genre);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("Director: " + director);
    }
    @Override
    public String toString(){
        String temp = (super.toString() + "Director: " + director);
        return temp;
    }
}
