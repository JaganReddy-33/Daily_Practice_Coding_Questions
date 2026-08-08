import java.util.Scanner;

public class Main {

     static void printAllSubarrays(int[] arr, int n) {
        for(int len=1; len<=n; len++){
            for(int i=0; i<=n-len; i++){
                StringBuilder sb = new StringBuilder();
                for(int j=i; j<i+len; j++){
                    sb.append(arr[j]).append(" ");
                }
                System.out.println(sb.toString().trim());
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