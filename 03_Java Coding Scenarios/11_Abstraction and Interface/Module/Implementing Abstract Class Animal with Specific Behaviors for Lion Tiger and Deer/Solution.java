import java.util.Scanner;

// Abstract class Animal
abstract class Animal {
    abstract void eat();
    abstract void sleep();
}

// Lion class extending Animal
class Lion extends Animal {
    @Override
    public void eat(){
        System.out.println("Lion is eating meat.");
    }

    @Override
    public void sleep(){
        System.out.println("Lion sleeps in its den for 8 hours.");
    }
}

// Tiger class extending Animal
class Tiger extends Animal {
    @Override
    public void eat(){
        System.out.println("Tiger is eating meat.");
    }

    @Override
    public void sleep(){
        System.out.println("Tiger sleeps under a tree for 7 hours.");
    }
}

// Deer class extending Animal
class Deer extends Animal {
    @Override
    public void eat(){
        System.out.println("Deer is eating grass.");
    }

    @Override
    public void sleep(){
        System.out.println("Deer sleeps in the forest for 6 hours.");
    }
}


// Main class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        if(str.equals("Lion")){
            Animal lion = new Lion();
            lion.eat();
            lion.sleep();
        } else if(str.equals("Tiger")){
            Animal tiger = new Tiger();
            tiger.eat();
            tiger.sleep();
        } else if(str.equals("Deer")){
            Animal deer = new Deer();
            deer.eat();
            deer.sleep();
        } 
    }
}