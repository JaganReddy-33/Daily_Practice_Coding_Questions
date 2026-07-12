import java.util.*;

class Sports{
  public void play(){

  }
}

class Football extends Sports {
  @Override
  public void play(){
    System.out.println("Playing football on the field.");
  }
}

class Basketball extends Sports {
  @Override
  public void play(){
    System.out.println("Playing basketball on the court.");
  }
}

class Rugby extends Sports {
  @Override
  public void play(){
    System.out.println("Playing rugby on the pitch.");
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String type = scanner.nextLine();

    Sports s = null;

    if(type.equalsIgnoreCase("Football")){
      s = new Football();
    } else if(type.equalsIgnoreCase("Basketball")){
      s = new Basketball();
    } else if(type.equalsIgnoreCase("Rugby")){
      s = new Rugby();
    }

    s.play();
  }
}