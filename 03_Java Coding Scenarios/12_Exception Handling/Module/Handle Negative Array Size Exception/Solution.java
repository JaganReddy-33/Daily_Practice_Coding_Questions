import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    try{
      int[] arr = new int[n];
      System.out.println("Array created with size: "+n);
    } catch(NegativeArraySizeException e){
      System.out.println("Array size cannot be negative");
    }
  }
}