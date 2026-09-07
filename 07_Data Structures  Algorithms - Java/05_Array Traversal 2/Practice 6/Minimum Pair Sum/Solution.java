import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }
        System.out.print(getMinPairSum(arr, n));
    }

    public static long getMinPairSum(long[] arr, int n) {
        long min1 = Long.MAX_VALUE;
        long min2 = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            long val = arr[i];
            if (val < min1) {
                min2 = min1;
                min1 = val;
            } else if (val < min2) {
                min2 = val;
            }
        }

        return min1 + min2;
    }
}