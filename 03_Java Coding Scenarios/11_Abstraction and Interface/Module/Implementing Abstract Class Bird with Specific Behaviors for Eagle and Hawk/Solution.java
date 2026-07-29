import java.util.Scanner;

// Abstract class Bird
abstract class Bird {
    abstract void fly();
    abstract void makeSound();
}

// Eagle class extending Bird
class Eagle extends Bird {
    @Override
    public void fly(){
        System.out.println("Eagle is soaring at great heights.");
    }

    @Override
    public void makeSound(){
        System.out.println("Eagle makes a sharp, piercing sound.");
    }
}

// Hawk class extending Bird
class Hawk extends Bird {
    @Override
    public void fly(){
        System.out.println("Hawk is flying swiftly over the plains.");
    }

    @Override
    public void makeSound(){
        System.out.println("Hawk makes a screeching sound.");
    }
}


// Main class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        if(str.equals("Eagle")){
            Bird e = new Eagle();
            e.fly();
            e.makeSound();
        } else if(str.equals("Hawk")){
            Bird h = new Hawk();
            h.fly();
            h.makeSound();
        }
    }
}