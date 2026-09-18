import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        long[] arr = new long[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }
        
        long k = scanner.nextLong();
        
        printCountGreaterThanKPrime(arr, n, k);
    }

    public static void printCountGreaterThanKPrime(long[] arr, int n, long k) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > k && isPrime(arr[i])) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isPrime(long num) {
        if (num <= 1) {
            return false;
        }
        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}