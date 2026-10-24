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
        
        printAllPrimeProductSubarrays(arr, n, m);
    }

    public static void printAllPrimeProductSubarrays(int[] arr, int n, int m) {
        boolean found = false;

        for (int len = m + 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                
                long prod = 1;
                for (int x = i; x <= j; x++) {
                    prod *= arr[x];
                }
                
                if (isPrime(prod)) {
                    found = true;
                    for (int x = i; x <= j; x++) {
                        System.out.print(arr[x] + " ");
                    }
                    System.out.println();
                }
            }
        }

        if (!found) {
            System.out.print("None");
        }
    }

    public static boolean isPrime(long num) {
        if (num <= 1) return false;
        for (long i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}