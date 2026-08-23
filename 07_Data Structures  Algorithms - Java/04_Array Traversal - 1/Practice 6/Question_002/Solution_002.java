import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }
        printAverageOfOddIndexElements(arr, n);
    }

    public static void printAverageOfOddIndexElements(long[] arr, int n) {
        long sum = 0;
        int count = 0;
        for (int i = 1; i < n; i += 2) {
            sum += arr[i];
            count++;
        }
        if (count > 0) {
            double average = (double) sum / count;
            System.out.printf("%.2f\n", average);
        } else {
            System.out.println("None");
        }
    }
}