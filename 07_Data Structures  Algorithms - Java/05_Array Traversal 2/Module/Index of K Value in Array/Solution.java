import java.util.*;

public class Main {

    public static void indexOfKVal(int[] arr, int k){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == k){
                System.out.print(i);
                return;
            }
        }
        System.out.print(-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        int k =scanner.nextInt();

        indexOfKVal(arr, k);
   
    }
}