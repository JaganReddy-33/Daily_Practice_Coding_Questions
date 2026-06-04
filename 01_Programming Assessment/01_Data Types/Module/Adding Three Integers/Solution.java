import java.util.*;

public class Main {

    public static int sumOfThree(int a, int b, int c){
        return a+b+c;
    }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Write your code here
    int m = scanner.nextInt();
    int n = scanner.nextInt();
    int k = scanner.nextInt();

    int res = sumOfThree(m, n, k);
    System.out.print(res);
  }
}