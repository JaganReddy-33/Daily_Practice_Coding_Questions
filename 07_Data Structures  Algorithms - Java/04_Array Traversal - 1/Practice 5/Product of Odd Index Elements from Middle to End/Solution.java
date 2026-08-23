import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }
        printProductOfOddIndicesFromMiddleToEnd(arr, n);
    }

    public static void printProductOfOddIndicesFromMiddleToEnd(long[] arr, int n) {
        int mid = n / 2;
        int start = (mid % 2 != 0) ? mid : mid + 1;
        long product = 1;
        boolean found = false;
        for (int i = start; i < n; i += 2) {
            product *= arr[i];
            found = true;
        }
        if (found) {
            System.out.println(product);
        } else {
            System.out.println("None");
        }
    }
}