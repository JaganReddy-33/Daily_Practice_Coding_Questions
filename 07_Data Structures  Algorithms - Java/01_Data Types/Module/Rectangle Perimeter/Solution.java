import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int l =scanner.nextInt();
    int w =scanner.nextInt();

    int perimeter = 2*(l+w);
    System.out.print(perimeter);
  }
}