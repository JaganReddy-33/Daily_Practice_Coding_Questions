import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Write your code here
    int r = scanner.nextInt(); 
    double pi = 3.142;

    double area = pi * r * r;
    System.out.printf("%.4f\n", area);
  }
}