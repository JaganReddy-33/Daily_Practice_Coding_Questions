class Heart {
    private int weight;
    private int bpm;

    public Heart(int weight, int bpm) {
        this.weight = weight;
        this.bpm = bpm;
    }

    public int getWeight() {
        return weight;
    }

    public int getBpm() {
        return bpm;
    }
}

class Brain {
    private int weight;
    private String colour;

    public Brain(int weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }
}

class Bike {
    private String brand;
    private int mileage;

    public Bike(String brand, int mileage) {
        this.brand = brand;
        this.mileage = mileage;
    }

    public String getBrand() {
        return brand;
    }

    public int getMileage() {
        return mileage;
    }
}

class Book {
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}

class Student {
    private Heart heart;
    private Brain brain;

    public Student() {
        this.heart = new Heart(289, 72);
        this.brain = new Brain(1400, "grey");
    }

    public void displayHeartAndBrain() {
        System.out.println(heart.getWeight());
        System.out.println(heart.getBpm());
        System.out.println(brain.getWeight());
        System.out.println(brain.getColour());
    }

    public void hasA(Bike bike) {
        System.out.println(bike.getBrand());
        System.out.println(bike.getMileage());
    }

    public void hasA(Book book) {
        System.out.println(book.getName());
        System.out.println(book.getAuthor());
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.displayHeartAndBrain();

        Bike bike = new Bike("Duke", 35);
        student.hasA(bike);

        Book book = new Book("Java", "JG");
        student.hasA(book);
    }
}