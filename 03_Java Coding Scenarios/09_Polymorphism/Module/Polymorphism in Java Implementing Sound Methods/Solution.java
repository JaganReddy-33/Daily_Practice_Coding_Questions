import java.util.*;

class Animal {
  public void sound(){

  }
}

class Bird extends Animal{
  @Override
  public void sound(){
    System.out.print("Chirp");
  }
} 

class Cat extends Animal {
  @Override
  public void sound(){
    System.out.print("Meow");
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String type = scanner.nextLine().trim();

    Animal a = null;

    if(type.equalsIgnoreCase("Bird")){
      a = new Bird();
    } else if(type.equalsIgnoreCase("Cat")){
      a = new Cat();
    } else {
      System.out.print("Unknown animal type");
      return;
    }

    a.sound();
  }
}