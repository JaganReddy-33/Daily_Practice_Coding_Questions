import java.util.Scanner;

public class Main {

    static void oddSubarrayLen(int[] arr, int n) {

        for (int len = 1; len <= n; len+=2) {
            for (int start = 0; start <= n - len; start++) {
                int sum = 0;
                int end = start + len - 1;
                
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        oddSubarrayLen(arr, N);
    }
}