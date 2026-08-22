import java.util.Scanner;

class Main {
    public static long sumEvenIndexFromMiddleToEnd(int[] arr) {
        int mid = arr.length / 2;
        int start = (mid % 2 == 0) ? mid : mid + 1;
        long sum = 0;
        for (int i = start; i < arr.length; i += 2) {
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
        System.out.println(sumEvenIndexFromMiddleToEnd(arr));
    }
}