import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        printPairsDifference(arr, n);
    }

    public static void printPairsDifference(int[] arr, int n) {
        if (n < 2) {
            System.out.println("None");
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.println(Math.abs(arr[i] - arr[j]));
            }
        }
    }
}