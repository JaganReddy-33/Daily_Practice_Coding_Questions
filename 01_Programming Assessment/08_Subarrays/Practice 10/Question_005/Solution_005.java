import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();      
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        printSmallestPrimeSumSubarray(arr, n, m);
    }

    public static void printSmallestPrimeSumSubarray(int[] arr, int n, int m) {

        for (int len = m + 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                
                long sum = 0;
                for (int x = i; x <= j; x++) {
                    sum += arr[x];
                }
                
                if (isPrime(sum)) {
                    for (int x = i; x <= j; x++) {
                        System.out.print(arr[x] + " ");
                    }
                    System.out.println();
                    return;
                }
            }
        }
        System.out.print("None");
    }

    public static boolean isPrime(long num) {
        if (num <= 1) return false;
        for (long i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}