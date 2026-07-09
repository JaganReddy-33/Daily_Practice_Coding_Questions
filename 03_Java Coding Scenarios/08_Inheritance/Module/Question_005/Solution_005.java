import java.util.Scanner;

class Appliance {
    private String brand;
    private String power;

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public void setPower(String power) {
        this.power = power;
    }
    public String getPower() {
        return power;
    }

    public String getDescription() {
        return "Brand: " + brand + ", Power: " + power;
    }
}

class WashingMachine extends Appliance {
    private String capacity;

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
    public String getCapacity() {
        return capacity;
    }

    @Override
    public String getDescription() {
        return "Brand: " + getBrand() + ", Power: " + getPower() + ", Capacity: " + capacity;
    }
}

class Refrigerator extends Appliance {
    private String volume;

    public void setVolume(String volume) {
        this.volume = volume;
    }
    public String getVolume() {
        return volume;
    }

    @Override
    public String getDescription() {
        return "Brand: " + getBrand() + ", Power: " + getPower() + ", Volume: " + volume;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.nextLine();
        String input = sc.nextLine();

        String[] details = input.split(",");

        if (type.equalsIgnoreCase("WashingMachine")) {
            WashingMachine wm = new WashingMachine();
            wm.setBrand(details[0].trim());
            wm.setPower(details[1].trim());
            wm.setCapacity(details[2].trim());

            System.out.println("Appliance Description: " + wm.getDescription());

        } else if (type.equalsIgnoreCase("Refrigerator")) {
            Refrigerator rf = new Refrigerator();
            rf.setBrand(details[0].trim());
            rf.setPower(details[1].trim());
            rf.setVolume(details[2].trim());

            System.out.println("Appliance Description: " + rf.getDescription());
        }
    }
}