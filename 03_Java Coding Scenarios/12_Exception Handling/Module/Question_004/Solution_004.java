import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    int index = scanner.nextInt();
    
    try{
      System.out.println(input.charAt(index));
    } catch(StringIndexOutOfBoundsException e){
      System.out.println("Invalid index for string");
    }
  }
}