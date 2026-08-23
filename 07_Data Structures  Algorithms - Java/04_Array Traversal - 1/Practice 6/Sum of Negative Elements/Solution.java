import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }
        printSumOfNegativeElements(arr, n);
    }

    public static void printSumOfNegativeElements(long[] arr, int n) {
        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}