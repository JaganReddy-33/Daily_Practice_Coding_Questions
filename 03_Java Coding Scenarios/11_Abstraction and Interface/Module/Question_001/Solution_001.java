import java.util.Scanner;

// Abstract class Animal
abstract class Animal {
    abstract void sound();
    
}

// Subclass Lion that extends Animal
class Lion extends Animal {
    @Override
    public void sound(){
        System.out.print("Roar");
    }
}

// Subclass Tiger that extends Animal
class Tiger extends Animal {
    @Override 
    public void sound(){
        System.out.print("Growl");
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Taking user input
        String str = scanner.nextLine();
       
        // Checking if the input is Lion or Tiger and calling appropriate methods
        if(str.equals("Lion")){
            Animal lion = new Lion();
            lion.sound();
        } else if(str.equals("Tiger")){
            Animal tiger = new Tiger();
            tiger.sound();
        }

        
    }
}