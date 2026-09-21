import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }
        
        printMaxPairProduct(arr, n);
    }

    public static void printMaxPairProduct(long[] arr, int n) {

        long max1 = Long.MIN_VALUE, max2 = Long.MIN_VALUE;
        long min1 = Long.MAX_VALUE, min2 = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            long val = arr[i];

            if (val > max1) {
                max2 = max1;
                max1 = val;
            } else if (val > max2) {
                max2 = val;
            }

            if (val < min1) {
                min2 = min1;
                min1 = val;
            } else if (val < min2) {
                min2 = val;
            }
        }

        long prod1 = max1 * max2;
        long prod2 = min1 * min2;

        long maxProduct = Math.max(prod1, prod2);
        System.out.println(maxProduct);
    }
}