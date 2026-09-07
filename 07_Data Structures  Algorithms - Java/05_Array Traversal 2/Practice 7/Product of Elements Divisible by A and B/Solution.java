import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        System.out.print(getProductDivisibleByAAndB(arr, n, a, b));
    }

    public static long getProductDivisibleByAAndB(long[] arr, int n, long a, long b) {
        long prod = 1;
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] % a == 0 && arr[i] % b == 0) {
                prod *= arr[i];
                found = true;
            }
        }
        return found ? prod : 0;
    }
}