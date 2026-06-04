import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int radius = scanner.nextInt();

    double pi = 3.142;
    double res = 2 * pi * radius;

    System.out.printf("%.4f\n", res);
  }
}