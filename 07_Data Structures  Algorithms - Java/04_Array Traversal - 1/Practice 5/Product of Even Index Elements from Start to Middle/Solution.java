import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }
        printProductOfEvenIndices(arr, n);
    }

    public static void printProductOfEvenIndices(long[] arr, int n) {
        long product = 1;
        int mid = n / 2;
        for (int i = 0; i <= mid; i += 2) {
            product *= arr[i];
        }
        System.out.println(product);
    }
}