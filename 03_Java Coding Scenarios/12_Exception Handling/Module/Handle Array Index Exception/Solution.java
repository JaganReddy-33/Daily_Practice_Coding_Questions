import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int[] arr = new int[size];
    for(int i=0; i<size; i++){
      arr[i] = scanner.nextInt();
    }
    int idx = scanner.nextInt();

    try{
      System.out.print(arr[idx]);
    } catch(ArrayIndexOutOfBoundsException e){
      System.out.print("Invalid index entered");
    }
  }
}