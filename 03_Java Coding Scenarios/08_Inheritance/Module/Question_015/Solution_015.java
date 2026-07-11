import java.util.Scanner;

class Food {
  private String name;
  private int calories;

  public Food(String name, int calories) {
    this.name = name;
    this.calories = calories;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getCalories() {
    return calories;
  }

  public void setCalories(int calories) {
    this.calories = calories;
  }

  public String getDetails() {
    return "Name: " + name + ", Calories: " + calories;
  }
}

class Fruit extends Food {
  private String color;

  public Fruit(String name, int calories, String color) {
    super(name, calories);
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public String getDetails() {
    return super.getDetails() + ", Color: " + color;
  }
}

class CitrusFruit extends Fruit {
  private String sournessLevel;

  public CitrusFruit(String name, int calories, String color, String sournessLevel) {
    super(name, calories, color);
    this.sournessLevel = sournessLevel;
  }

  public String getSournessLevel() {
    return sournessLevel;
  }

  public void setSournessLevel(String sournessLevel) {
    this.sournessLevel = sournessLevel;
  }

  @Override
  public String getDetails() {
    return super.getDetails() + ", Sourness Level: " + sournessLevel;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String input = scanner.nextLine();
    String[] parts = input.split(",");

    String name = parts[0].trim();
    int calories = Integer.parseInt(parts[1].trim());
    String color = parts[2].trim();
    String sournessLevel = parts[3].trim();

    CitrusFruit citrus = new CitrusFruit(name, calories, color, sournessLevel);
    System.out.println("Citrus Fruit Details: " + citrus.getDetails());


  }
}