import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    try{
      int n = scanner.nextInt();
      int[] arr = new int[n];
      for(int i=0; i<n; i++){
        arr[i]=scanner.nextInt();
      }
      int idx = scanner.nextInt();

      System.out.print(arr[idx]);
    } catch(NegativeArraySizeException e){
      System.out.print("Array size cannot be negative");
    } catch(ArrayIndexOutOfBoundsException e){
      System.out.print("Invalid index, index out of bounds");
    } catch(InputMismatchException e){
      System.out.print("Invalid input, please enter integers only");
    }
  }
}