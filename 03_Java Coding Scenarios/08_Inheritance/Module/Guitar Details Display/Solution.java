import java.util.*;

class Instrument {
  private String type;
  private String origin;
  
  public Instrument(String type, String origin) {
    this.type = type;
    this.origin = origin;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public String getDetails() {
    return "Type: " + type + ", Origin: " + origin;
  }
}

class StringInstrument extends Instrument {
  private int numberOfStrings;

  public StringInstrument(String type, String origin, int numberOfStrings) {
    super(type, origin);
    this.numberOfStrings = numberOfStrings;
  }

  public int getNumberOfStrings() {
    return numberOfStrings;
  }

  public void setNumberOfStrings(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  @Override
  public String getDetails() {
    return super.getDetails() + ", Number of Strings: " + numberOfStrings;
  }
}

class Guitar extends StringInstrument {
  private boolean electric;

  public Guitar(String type, String origin, int numberOfStrings, boolean electric) {
    super(type, origin, numberOfStrings);
    this.electric = electric;
  }

  public boolean isElectric() {
    return electric;
  }

  public void setElectric(boolean electric) {
    this.electric = electric;
  }

  @Override
  public String getDetails() {
    return "Guitar Details: " + super.getDetails() + ", Electric: " + electric;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String input = scanner.nextLine().trim();
    String[] parts = input.split(",");
    
    String type = parts[0].trim();
    String origin = parts[1].trim();
    int numberOfStrings = Integer.parseInt(parts[2].trim());
    boolean electric = Boolean.parseBoolean(parts[3].trim());
                    
    Guitar guitar = new Guitar(type, origin, numberOfStrings, electric);
    System.out.println(guitar.getDetails());
  }
}