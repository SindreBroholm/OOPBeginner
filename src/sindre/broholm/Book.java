package sindre.broholm;

public class Book implements Product {
    private String title;
    private String author;
    protected int price = -1;
    protected long productId = -1;

    public int getPrice() {
        return price;
    }

    public long getProductId() {
        return productId;
    }

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, String author) {
        this(title);
        this.author = author;
    }

    public Book(String title, String author, int price) {
        this(title, author);
        this.price = price;
    }

    public Book(String title, String author, int price, long productId) {
        this(title, author, price);
        this.productId = productId;
    }

    @Override
    public String toString() {
        String toString = (title + "," + author + ", " + price + ", " + productId + ".");
        return toString;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void printDetails() {
        System.out.println("----------Book----------");
        if (!(title.isEmpty())) {
            System.out.println("Title: " + title);
        } else {
            System.out.println("Title: Not set!");
        }
        if (!(author.isEmpty())) {
            System.out.println("Author: " + author);
        } else {
            System.out.println("Author: Not set!");
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
}

