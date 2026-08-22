import java.util.Scanner;

class Main {
    public static long sumOddIndexToMiddle(int[] arr) {
        int mid = arr.length  / 2;
        long sum = 0;
        for (int i = 1; i <= mid; i += 2) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(sumOddIndexToMiddle(arr));

    }
}