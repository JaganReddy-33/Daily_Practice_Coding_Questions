import java.util.*;

public class Main {

    public static void sumCombinationOfThree(int a, int b, int c){
        System.out.println(a + b);
        System.out.println(a + c);
        System.out.println(b + c);
    }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int m = scanner.nextInt();
    int n = scanner.nextInt();
    int k = scanner.nextInt();

    sumCombinationOfThree(m, n, k);
  }
}