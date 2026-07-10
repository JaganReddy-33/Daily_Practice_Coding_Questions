import java.util.Scanner;

class Device{
    private String brand;
    private String model;

    public Device(String brand,String model){
        this.brand=brand;
        this.model=model;
    }

    public String getBrand(){ 
      return brand; 
    }
    public void setBrand(String brand){ 
      this.brand=brand;
     }

    public String getModel(){ 
      return model; 
    }
    public void setModel(String model){
      this.model=model; 
    }

    public String getDetails(){
        return "Brand: "+brand+", Model: "+model;
    }
}

class Laptop extends Device{
    private String ram;

    public Laptop(String brand,String model,String ram){
        super(brand,model);
        this.ram=ram;
    }

    public String getRam(){ 
      return ram; 
    }
    public void setRam(String ram){ 
      this.ram=ram; 
    }

    @Override
    public String getDetails(){
        return super.getDetails()+", RAM: "+ram;
    }
}

class Smartphone extends Device{
    private String battery;

    public Smartphone(String brand,String model,String battery){
        super(brand,model);
        this.battery=battery;
    }

    public String getBattery(){ 
      return battery; 
    }
    public void setBattery(String battery){ 
      this.battery=battery; 
    }

    @Override
    public String getDetails(){
        return super.getDetails()+", Battery: "+battery;
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String DeviceType=sc.nextLine();
        String[] details=sc.nextLine().split(",");

        if(DeviceType.equalsIgnoreCase("Laptop")){
            Laptop laptop=new Laptop( details[0].trim(), details[1].trim(),  details[2].trim());
            System.out.println("Device Details: "+laptop.getDetails());
        } else if(DeviceType.equalsIgnoreCase("Smartphone")){
            Smartphone smartphone=new Smartphone( details[0].trim(), details[1].trim(), details[2].trim());
            System.out.println("Device Details: "+smartphone.getDetails());
        }
    }
}