import java.util.*;


class Device {
  private String brand;
  private String model;

  public Device(String brand, String model){
    this.brand = brand;
    this.model = model;
  }

  public String getBrand(){
    return brand;
  }
  public void setBrand(String brand){
    this.brand = brand;
  }

  public String getModel(){
    return model;
  }
  public void setModel(String model){
    this.model = model;
  }

  public String getDetails(){
    return "Brand: " + brand + ", Model: "+model;
  }
} 
class MobileDevice extends Device {
  private String batteryLife;

  public MobileDevice(String brand, String model, String batteryLife){
    super(brand, model);
    this.batteryLife = batteryLife;
  }
  public String getBatteryLife(){
    return batteryLife;
  }
  public void setBatterLife(String batteryLife){
    this.batteryLife = batteryLife;
  }

  public String getDetails(){
    return super.getDetails() +", Battery Life: "+batteryLife;
  }
}
class Smartphone extends MobileDevice {
  private String operatingSystem;

  public Smartphone(String brand, String model, String batteryLife, String operatingSystem){
    super(brand, model, batteryLife);
    this.operatingSystem = operatingSystem;
  }

  public String getOS(){
    return operatingSystem;
  }
  public void setOS(String operatingSystem){
    this.operatingSystem = operatingSystem;
  }

  public String getDetails(){
    return super.getDetails() + ", Operating System: "+operatingSystem;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String input = scanner.nextLine();
    String[] details = input.split(",");

    String brand = details[0].trim();
    String model = details[1].trim();
    String batteryLife = details[2].trim();
    String operatingSystem = details[3].trim();

    Smartphone smartphone = new Smartphone(brand, model, batteryLife, operatingSystem);
    System.out.print("Smartphone Details: "+smartphone.getDetails());

  }
}