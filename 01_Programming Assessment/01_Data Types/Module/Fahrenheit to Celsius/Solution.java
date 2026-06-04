import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Write your code here
    int fah = scanner.nextInt();

    double cel = (fah - 32)*5.0/9.0;
    System.out.printf("%.4f\n", cel);
  }
}