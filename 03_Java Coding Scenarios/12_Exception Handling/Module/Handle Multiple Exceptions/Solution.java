import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try{
      int numerator = scanner.nextInt();
      int denominator = scanner.nextInt();
      int res = numerator / denominator;
      System.out.print("Result: "+res);
    } catch(ArithmeticException e){
      System.out.print("Division by zero is not allowed");
    } catch(InputMismatchException e){
      System.out.print("Invalid input, please enter integers only");
    }
  }
}