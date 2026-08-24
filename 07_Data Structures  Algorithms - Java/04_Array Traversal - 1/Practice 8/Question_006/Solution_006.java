import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        printDifferenceOfPrimes(arr);
    }

    public static void printDifferenceOfPrimes(int[] arr) {
        long sum = 0;
        int count = 0;
        for (int num : arr) {
            if (isPrime(num)) {
                sum += num;
                count++;
            }
        }
        System.out.println(sum - count);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; (long) i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}