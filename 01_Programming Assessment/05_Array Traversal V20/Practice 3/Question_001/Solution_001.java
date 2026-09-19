import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }
        long k = scanner.nextLong();
        
        printCountGreaterThanK(arr, n, k);
    }

    public static void printCountGreaterThanK(long[] arr, int n, long k) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > k) {
                count++;
            }
        }
        System.out.println(count);
    }
}