import java.util.Scanner;

class Main {
    public static double calculateAverage(int[] arr, int n) {
        int min = arr[0];
        int max = arr[0];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            sum += arr[i];
        }
        sum = sum - min - max;
        return sum / (n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        double avg = calculateAverage(arr, n);
        System.out.printf("%.2f\n", avg);
    }
}