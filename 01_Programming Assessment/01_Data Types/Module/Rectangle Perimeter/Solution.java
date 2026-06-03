import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Write your code here
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    int perimeter = 2 * (a + b);

    System.out.print(perimeter);
  }
}