import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }
        System.out.print(getMinProduct(arr, n));
    }

    public static long getMinProduct(long[] arr, int n) {
        long min1 = Long.MAX_VALUE;
        long min2 = Long.MAX_VALUE;
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            long val = arr[i];

            if (val < min1) {
                min2 = min1;
                min1 = val;
            } else if (val < min2) {
                min2 = val;
            }

            if (val > max1) {
                max2 = max1;
                max1 = val;
            } else if (val > max2) {
                max2 = val;
            }
        }

        long p1 = min1 * min2;
        long p2 = max1 * max2;
        long p3 = min1 * max1;

        long res = p1;
        if (p2 < res) {
            res = p2;
        }
        if (p3 < res) {
            res = p3;
        }
        return res;
    }
}