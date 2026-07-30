import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    
    try{
      int num = Integer.parseInt(input);
      System.out.println(num);
    } catch(NumberFormatException e){
      System.out.println("Invalid number format");
    }
  }
}