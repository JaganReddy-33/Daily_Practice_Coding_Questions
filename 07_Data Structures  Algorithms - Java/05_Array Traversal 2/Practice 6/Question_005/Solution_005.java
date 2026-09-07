import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }
        System.out.print(getMaxPairSum(arr, n));
    }

    public static long getMaxPairSum(long[] arr, int n) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            long val = arr[i];
            if (val > max1) {
                max2 = max1;
                max1 = val;
            } else if (val > max2) {
                max2 = val;
            }
        }

        return max1 + max2;
    }
}