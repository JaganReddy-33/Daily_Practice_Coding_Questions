import java.util.*;

class Appliance {
  private String brand;
  private String power;

  public Appliance(String brand, String power){
    this.brand = brand;
    this.power = power;
  }

  public String getBrand(){
    return brand;
  }
  public void setBrand(String brand){
    this.brand = brand;
  }
  public String getPower(){
    return power;
  }
  public void setPower(String power){
    this.power = power;
  }

  public String getInfo(){
    return "Brand: "+brand +", Power: " + power;
  }
}
class WashingMachine extends Appliance {
  private String capacity;

  public WashingMachine(String brand, String power, String capacity){
    super(brand, power);
    this.capacity = capacity;
  }
  public String getCapacity(){
    return capacity;
  }
  public void setCapacity(String capacity){
    this.capacity = capacity;
  }

  @Override
  public String getInfo(){
    return super.getInfo() + ", Capacity: "+capacity;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String input = scanner.nextLine();
    String[] details = input.split(",");

    String brand = details[0].trim();
    String power = details[1].trim();
    String capacity = details[2].trim();

    WashingMachine wm = new WashingMachine(brand, power, capacity);
    System.out.print("Washing Machine Info: "+wm.getInfo());

  }
}