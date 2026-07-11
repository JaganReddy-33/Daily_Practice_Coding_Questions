import java.util.*;

class Building {
  private String address;
  private int floors;

  public Building(String address, int floors) {
    this.address = address;
    this.floors = floors;
  }

  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  public int getFloors() {
    return floors;
  }

  public void setFloors(int floors) {
    this.floors = floors;
  }

  public String getDetails() {
    return "Address: " + address + ", Floors: " + floors;
  }
}

class ResidentialBuilding extends Building {
  private int numberOfApartments;

  public ResidentialBuilding(String address, int floors, int numberOfApartments) {
    super(address, floors);
    this.numberOfApartments = numberOfApartments;
  }

  public int getNumberOfApartments() {
    return numberOfApartments;
  }

  public void setNumberOfApartments(int numberOfApartments) {
    this.numberOfApartments = numberOfApartments;
  }

  @Override
  public String getDetails() {
    return super.getDetails() + ", Number of Apartments: " + numberOfApartments;
  }
}

class Apartment extends ResidentialBuilding {
  private String unitNumber;

  public Apartment(String address, int floors, int numberOfApartments, String unitNumber) {
    super(address, floors, numberOfApartments);
    this.unitNumber = unitNumber;
  }

  public String getUnitNumber() {
    return unitNumber;
  }

  public void setUnitNumber(String unitNumber) {
    this.unitNumber = unitNumber;
  }

  @Override
  public String getDetails() {
    return super.getDetails() + ", Unit Number: " + unitNumber;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String input = scanner.nextLine();
    String[] parts = input.split(",");
        
    String address = parts[0].trim();
    int floors = Integer.parseInt(parts[1].trim());
    int numberOfApartments = Integer.parseInt(parts[2].trim());
    String unitNumber = parts[3].trim();

    Apartment apartment = new Apartment(address, floors, numberOfApartments, unitNumber);
    System.out.println("Apartment Details: " + apartment.getDetails());
      
  }
}