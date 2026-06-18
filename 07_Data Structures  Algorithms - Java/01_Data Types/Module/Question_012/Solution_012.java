import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int r = scanner.nextInt();
    int h =scanner.nextInt();

    double pi = 3.142;

    double formula = 2*pi*r*(r+h);
    System.out.printf("%.4f", formula);
  }
}