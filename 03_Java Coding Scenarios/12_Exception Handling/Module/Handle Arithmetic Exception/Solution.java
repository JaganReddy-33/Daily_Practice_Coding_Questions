import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numerator = scanner.nextInt();
    int denominator = scanner.nextInt();


    try{
      int res = numerator / denominator;
      System.out.print(res);
    } catch (ArithmeticException e){
      System.out.println("Cannot divide by zero");
    }
  }
}