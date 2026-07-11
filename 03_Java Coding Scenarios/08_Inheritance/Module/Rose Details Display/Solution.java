import java.util.*;

class Plant {
  private String species;
  private String height;

  public Plant() {}

  public Plant(String species, String height) {
    this.species = species;
    this.height = height;
  }

  public String getSpecies() {
    return species;
  }

  public void setSpecies(String species) {
    this.species = species;
  }

  public String getHeight() {
    return height;
  }

  public void setHeight(String height) {
    this.height = height;
  }

  public String getInfo() {
    return "Species: " + species + ", Height: " + height;
  }
}

class FloweringPlant extends Plant {
  private String flowerColor;

  public FloweringPlant() {}

  public FloweringPlant(String species, String height, String flowerColor) {
    super(species, height);
    this.flowerColor = flowerColor;
  }

  public String getFlowerColor() {
    return flowerColor;
  }

  public void setFlowerColor(String flowerColor) {
    this.flowerColor = flowerColor;
  }

  @Override
  public String getInfo() {
    return super.getInfo() + ", Flower Color: " + flowerColor;
  }
}

class Rose extends FloweringPlant {
  private boolean thorns;

  public Rose() {}

  public Rose(String species, String height, String flowerColor, boolean thorns) {
    super(species, height, flowerColor);
    this.thorns = thorns;
  }

  public boolean isThorns() {
    return thorns;
  }

  public void setThorns(boolean thorns) {
    this.thorns = thorns;
  }

  @Override
  public String getInfo() {
    return super.getInfo() + ", Thorns: " + thorns;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String input = scanner.nextLine();
    String[] tokens = input.split(",");
        
    String species = tokens[0].trim();
    String height = tokens[1].trim();
    String flowerColor = tokens[2].trim();
    boolean thorns = Boolean.parseBoolean(tokens[3].trim());

    Rose rose = new Rose(species, height, flowerColor, thorns);
    System.out.println("Rose Details: " + rose.getInfo());

  }
}