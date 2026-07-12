import java.util.*;

class Plane {
  public void fly(){

  }
}
class CargoPlane extends Plane {

  @Override
  public void fly(){
    System.out.print("CargoPlane is flying at low heights.");
  }
}

class PassengerPlane extends Plane {
  @Override
  public void fly(){
    System.out.print("PassengerPlane is flying at medium heights.");
  }
}

class FighterPlane extends Plane {

  @Override
  public void fly(){
    System.out.print("FighterPlane is flying at great heights.");
  }
}


public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String type = scanner.nextLine().trim();

    CargoPlane cp = new CargoPlane();
    PassengerPlane pp = new PassengerPlane();
    FighterPlane fp = new FighterPlane();

    Plane plane = null;

    if(type.equalsIgnoreCase("CargoPlane")){
      plane = cp;
    } else if (type.equalsIgnoreCase("PassengerPlane")){
      plane = pp;
    } else if(type.equalsIgnoreCase("FighterPlane")){
      plane = fp;
    }

    plane.fly();

  }
}