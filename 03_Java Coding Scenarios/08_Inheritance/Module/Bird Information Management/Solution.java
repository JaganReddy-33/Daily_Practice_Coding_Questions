import java.util.*;


class Animal {
  private String species;
  private String lifespan;

  public Animal(String species, String lifespan){
    this.species = species;
    this.lifespan = lifespan;
  }

  public String getSpecies(){
    return species;
  }
  public void setSpecies(String species){
    this.species = species;
  }
  public String getLifespan(){
    return lifespan;
  }
  public void setLifespan(String lifespan){
    this.lifespan = lifespan;
  }

  public String getDetails(){
    return "Species: "+species +", Lifespan: "+lifespan;
  }
}

class Bird extends Animal {
  private String wingSpan;

  public Bird(String species, String lifespan, String wingSpan){
    super(species, lifespan);
    this.wingSpan = wingSpan;
  }

  public String getWingspan(){
    return wingSpan;
  }
  public void setWingspan(String wingSpan){
    this.wingSpan = wingSpan;
  }

  public String getDetails(){
    return super.getDetails()+", Wingspan: "+wingSpan;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String input = scanner.nextLine();
    String[] details = input.split(",");

    String species = details[0].trim();
    String lifespan = details[1].trim();
    String wingSpan = details[2].trim();

    Bird bird = new Bird(species, lifespan, wingSpan);
    System.out.print("Bird Details: "+bird.getDetails());

  }
}