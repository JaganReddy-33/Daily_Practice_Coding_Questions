import java.util.*;

class Gadget {
  private String brand;
  private int price;

  public Gadget(String brand, int price) {
    this.brand = brand;
    this.price = price;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getDetails() {
    return "Brand: " + brand + ", Price: " + price;
  }
}

class Wearable extends Gadget {
  private String batteryLife;

  public Wearable(String brand, int price, String batteryLife) {
    super(brand, price);
    this.batteryLife = batteryLife;
  }

  public String getBatteryLife() {
    return batteryLife;
  }

  public void setBatteryLife(String batteryLife) {
    this.batteryLife = batteryLife;
  }

  @Override
  public String getDetails() {
    return super.getDetails() + ", Battery Life: " + batteryLife;
  }
}

class SmartWatch extends Wearable {
  private boolean waterResistant;

  public SmartWatch(String brand, int price, String batteryLife, boolean waterResistant) {
    super(brand, price, batteryLife);
    this.waterResistant = waterResistant;
  }

  public boolean isWaterResistant() {
    return waterResistant;
  }

  public void setWaterResistant(boolean waterResistant) {
    this.waterResistant = waterResistant;
  }

  @Override
  public String getDetails() {
    return "SmartWatch Details: " + super.getDetails() + ", Water Resistant: " + waterResistant;
  }
}

public class Main {
  public static void main(String[] sender) {
    Scanner scanner = new Scanner(System.in);

    String input = scanner.nextLine();
    String[] parts = input.split(",");

    String brand = parts[0];
    int price = Integer.parseInt(parts[1]);
    String batteryLife = parts[2];
    boolean waterResistant = Boolean.parseBoolean(parts[3]);

    SmartWatch smartWatch = new SmartWatch(brand, price, batteryLife, waterResistant);
    System.out.println(smartWatch.getDetails());
  }
}