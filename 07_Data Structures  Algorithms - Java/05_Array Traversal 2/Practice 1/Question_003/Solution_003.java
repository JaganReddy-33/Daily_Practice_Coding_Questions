import java.util.Scanner;

class Main {
    public static int findMissingNumber(int[] arr, int n) {
        long totalSum = (long) (n + 1) * (n + 2) / 2;
        long arrSum = 0;
        for (int i = 0; i < n; i++) {
            arrSum += arr[i];
        }
        return (int) (totalSum - arrSum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int missing = findMissingNumber(arr, n);
        System.out.println(missing);
    }
}