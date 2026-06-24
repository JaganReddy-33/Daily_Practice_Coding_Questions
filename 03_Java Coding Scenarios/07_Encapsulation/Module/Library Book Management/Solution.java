import java.util.*;

class Book {
    // Private member variables
    private String ISBN;
    private String title;
    private String author;
    private float price;

    // Getter and setter methods for ISBN
    public String getISBN(){
        return ISBN;
    }

    public void setISBN(String ISBN){
            this.ISBN = ISBN;
    }

    // Getter and setter methods for title
    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
            this.title = title;
    }

    // Getter and setter methods for author

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
            this.author = author;
    }

    // Getter and setter methods for price
    public float getPrice(){
        return price;
    }

    public void setPrice(float price){
            this.price = price;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // Create a Book object
        Book bc = new Book();

        // Take input for all the attributes using setter methods
        bc.setISBN(sc.nextLine());
        bc.setTitle(sc.nextLine());
        bc.setAuthor(sc.nextLine());
        bc.setPrice(sc.nextFloat());

        // Display the book's information using getter methods
        System.out.println(bc.getISBN());
        System.out.println(bc.getTitle());
        System.out.println(bc.getAuthor());
        System.out.println( bc.getPrice());
    }
}