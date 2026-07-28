class Processor {
    private String brand;
    private int cores;
    private double clockSpeed;

    public Processor(String brand, int cores, double clockSpeed) {
        this.brand = brand;
        this.cores = cores;
        this.clockSpeed = clockSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public int getCores() {
        return cores;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }
}

class Monitor {
    private String brand;
    private int size;

    public Monitor(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return size;
    }
}

class Computer {
    private Processor processor;

    public Computer() {
        this.processor = new Processor("Intel", 4, 2.5);
    }

    public void displayProcessor() {
        System.out.println("Processor Brand: " + processor.getBrand());
        System.out.println("Processor Cores: " + processor.getCores());
        System.out.println("Processor Clock Speed: " + processor.getClockSpeed() + " GHz");
    }

    public void hasA(Monitor monitor) {
        if (monitor != null) {
            System.out.println("Monitor Brand: " + monitor.getBrand());
            System.out.println("Monitor Size: " + monitor.getSize() + " inches");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.displayProcessor();

        Monitor monitor = new Monitor("Dell", 24);
        computer.hasA(monitor);
    }
}