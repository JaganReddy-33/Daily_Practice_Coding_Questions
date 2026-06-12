import java.util.*;

public class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String str = scanner.nextLine();
      String ch1 = scanner.next();
      String ch2 =scanner.next();

      System.out.print(str.replace(ch1, ch2));
    }
}