import java.util.*;

public class Main {

    public static void evenPairs(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]%2==0 && arr[j]%2==0){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Write your code here
    int n = scanner.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
        arr[i]=scanner.nextInt();
    }

    evenPairs(arr);
  }
}