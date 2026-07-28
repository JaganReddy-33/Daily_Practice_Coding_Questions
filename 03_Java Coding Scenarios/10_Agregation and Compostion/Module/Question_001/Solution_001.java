class OS {
    private String name;
    private int size;

    public OS(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}

class Charger {
    private String brand;
    private float voltage;

    public Charger(String brand, float voltage) {
        this.brand = brand;
        this.voltage = voltage;
    }

    public String getBrand() {
        return brand;
    }

    public float getVoltage() {
        return voltage;
    }
}

class Mobile {
    private OS os;

    public Mobile() {
        this.os = new OS("Android", 512);
    }

    public void displayOS() {
        if (os != null) {
            System.out.println(os.getName());
            System.out.println(os.getSize());
        }
    }
    public void hasA(Charger c) {
        if (c != null) {
            System.out.println(c.getBrand());
            System.out.println(c.getVoltage());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.displayOS();

        Charger charger = new Charger("Samsung", 24.5f);
        mobile.hasA(charger);
    }
}