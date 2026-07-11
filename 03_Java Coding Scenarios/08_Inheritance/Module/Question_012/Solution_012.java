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

  public String getDescription(){
    return "Brand: "+brand +", Power: "+power;
  }
}

class KitchenAppliance extends Appliance {
  private String use;

  public KitchenAppliance(String brand, String power, String use){
    super(brand, power);
    this.use = use;
  }
  public String getUse(){
    return use;
  }
  public void setUse(String use){
    this.use = use;
  }

  @Override
  public String getDescription(){
    return super.getDescription()+", Use: "+ use;
  }
}

class Blender extends KitchenAppliance {
  private int speedSetting;

  public Blender(String brand, String power, String use, int speedSetting){
    super(brand, power, use);
    this.speedSetting = speedSetting;
  }

  public int getSpeed(){
    return speedSetting;
  }
  public void setSpeed(int speedSetting){
    this.speedSetting = speedSetting;
  }

  @Override
  public String getDescription(){
    return super.getDescription()+", Speed Settings: "+speedSetting;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String input = scanner.nextLine();
    String[] details = input.split(",");

    String brand = details[0].trim();
    String power = details[1].trim();
    String use = details[2].trim();
    int speedSetting = Integer.parseInt(details[3].trim());

    Blender blender = new Blender(brand, power, use, speedSetting);
    System.out.print("Blender Details: "+blender.getDescription());
  }
}