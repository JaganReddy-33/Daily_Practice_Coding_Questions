import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }
        printAverageOfOddElements(arr, n);
    }

    public static void printAverageOfOddElements(long[] arr, int n) {
        long sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
                count++;
            }
        }
        if (count > 0) {
            double average = (double) sum / count;
            System.out.printf("%.2f\n", average);
        } else {
            System.out.println("None");
        }
    }
}