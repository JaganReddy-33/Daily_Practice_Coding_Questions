import java.util.*;

class Animal{
  private String name;
  private int age;

  public Animal(String name, int age){
    this.name = name;
    this.age = age;
  }

  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
  public int getAge(){
    return age;
  }
  public void setAge(int age){
    this.age = age;
  }

  public String getSound(){
    return "";
  }
}
 class Dog extends Animal{
  private String breed;

  public Dog(String name, int age, String breed){
    super(name, age);
    this.breed = breed;
  }

  public String getBreed(){
    return breed;
  }
  public void setBreed(String breed){
    this.breed = breed;
  }

  @Override
  public String getSound(){
    return "Bark";
  }
 }

 class Cat extends Animal {
  private String color;

  public Cat(String name, int age, String color){
    super(name, age);
    this.color = color;
  }

  public String getColor(){
    return color;
  }
  public void setColor(String color){
    this.color = color;
  }

  @Override
  public String getSound(){
    return "Meow";
  }

 }

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String animalType = scanner.nextLine().trim();
    String details =  scanner.nextLine().trim();
    String[] arr = details.split(",");

    String name = arr[0];
    int age = Integer.parseInt(arr[1]);  

    if(animalType.equalsIgnoreCase("Dog")){
      String breed = arr[2];
      Dog dog = new Dog(name, age, breed);
      System.out.print("Sound of Dog: "+dog.getSound());
    } else if(animalType.equalsIgnoreCase("Cat")){
      String color =arr[2];
      Cat cat = new Cat(name, age, color);
      System.out.print("Sound of Cat: "+cat.getSound());
    }
  }
}