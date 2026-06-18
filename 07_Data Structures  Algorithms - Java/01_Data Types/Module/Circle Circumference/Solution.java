import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int radius = scanner.nextInt();
    int r = scanner.nextInt();
    double pi = 3.142;

    System.out.printf("%.4f\n", 2*pi*r);
  }
}