import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try{
      int n = scanner.nextInt();
      System.out.println("The entered integer is: "+n);
    } catch(InputMismatchException e){
      System.out.println("Invalid input, please enter an integer");
    }
  }
}