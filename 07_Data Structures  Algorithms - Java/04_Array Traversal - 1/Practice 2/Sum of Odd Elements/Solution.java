import java.util.Scanner;

class Main {
    static long sumOfOdd(int[] arr) {
        long sum = 0;
        for (int val : arr) {
            if (val % 2 != 0) {
                sum += val;
            }
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
        System.out.println(sumOfOdd(arr));
    }
}