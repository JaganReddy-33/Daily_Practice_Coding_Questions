import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }
        
        printAverageExcludingMinMax(arr, n);
    }

    public static void printAverageExcludingMinMax(long[] arr, int n) {
        long sum = 0;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        long sumExcludingMinMax = sum - min - max;
        double average = (double) sumExcludingMinMax / (n - 2);
        
        System.out.printf("%.2f\n", average);
    }
}