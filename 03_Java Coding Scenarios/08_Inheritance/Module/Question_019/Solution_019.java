import java.util.Scanner;

class Vehicle {
  private String make;
  private String model;

  public Vehicle(String make, String model) {
    this.make = make;
    this.model = model;
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getDetails() {
    return "Make: " + make + ", Model: " + model;
  }
}

class Car extends Vehicle {
  private int numberOfDoors;

  public Car(String make, String model, int numberOfDoors) {
    super(make, model);
    this.numberOfDoors = numberOfDoors;
  }

  public int getNumberOfDoors() {
    return numberOfDoors;
  }

  public void setNumberOfDoors(int numberOfDoors) {
    this.numberOfDoors = numberOfDoors;
  }

  @Override
  public String getDetails() {
    return "Car Details: " + super.getDetails() + ", Number of Doors: " + numberOfDoors;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String input = scanner.nextLine();
    String[] parts = input.split(",");
    
    String make = parts[0].trim();
    String model = parts[1].trim();
    int numberOfDoors = Integer.parseInt(parts[2].trim());

    Car car = new Car(make, model, numberOfDoors);
    System.out.println(car.getDetails());
  }
}