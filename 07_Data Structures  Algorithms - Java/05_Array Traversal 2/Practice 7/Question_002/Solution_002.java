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
        System.out.print(getSumDivisibleByAAndB(arr, n, a, b));
    }

    public static long getSumDivisibleByAAndB(long[] arr, int n, long a, long b) {
        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % a == 0 && arr[i] % b == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
}