import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(sumOfOddIndexElements(arr));
    }

    public static long sumOfOddIndexElements(int[] arr) {
        long sum = 0;
        for (int i = 1; i < arr.length; i += 2) {
            sum += arr[i];
        }
        return sum;
    }
}