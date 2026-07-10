import java.util.*;

class Animal {
    private String name;
    private String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getInfo() {
        return "Name: " + name + ", Species: " + species;
    }
}

class Mammal extends Animal {
    private String isDomesticated;

    public Mammal(String name, String species, String isDomesticated) {
        super(name, species);
        this.isDomesticated = isDomesticated;
    }

    public String getIsDomesticated() {
        return isDomesticated;
    }

    public void setIsDomesticated(String isDomesticated) {
        this.isDomesticated = isDomesticated;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Domesticated: " + isDomesticated;
    }
}

class Dog extends Mammal {
    private String breed;

    public Dog(String name, String species, String isDomesticated, String breed) {
        super(name, species, isDomesticated);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Breed: " + breed;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] details = input.split(",");

        if (details.length == 4) {
            String name = details[0].trim();
            String species = details[1].trim();
            String isDomesticated = details[2].trim();
            String breed = details[3].trim();

            Dog dog = new Dog(name, species, isDomesticated, breed);
            System.out.println("Dog Details: " + dog.getInfo());
        }
    }
}