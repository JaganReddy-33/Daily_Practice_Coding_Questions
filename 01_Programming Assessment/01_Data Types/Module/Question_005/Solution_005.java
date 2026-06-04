import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Write your code here
    int dollar = scanner.nextInt();

    double rupees = dollar * 82.73;

    System.out.print("%.4f\n", rupees);
  }
}