import java.util.Scanner;

public class Main {

     static void printAllSubarrays(int[] arr, n) {
        for(int len = 1; len<=n; len++){
            for(int start=0; start<=n-len; start++){
                int end = start + len -1;
                for(int k=start; k<=end; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
     }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        printAllSubarrays(arr, n);
    }
}