import java.util.Scanner;

class Main {

    public static long sumOfDivisibleElements(long[] arr, long m) {
        long sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % m == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }
        long m = scanner.nextLong();

        long result = sumOfDivisibleElements(arr, m);
        System.out.println(result);
    }
}