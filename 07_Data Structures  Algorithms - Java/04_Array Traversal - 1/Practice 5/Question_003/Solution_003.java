import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }
        printProductOfEvenIndicesFromMiddleToEnd(arr, n);
    }

    public static void printProductOfEvenIndicesFromMiddleToEnd(long[] arr, int n) {
        int mid = (n - 1) / 2;
        int start = (mid % 2 == 0) ? mid : mid + 1;
        long product = 1;
        for (int i = start; i < n; i += 2) {
            product *= arr[i];
        }
        System.out.println(product);
    }
}