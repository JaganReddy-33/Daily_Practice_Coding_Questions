import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        printPrimeProductSubarrays(arr, n);
    }

    public static void printPrimeProductSubarrays(int[] arr, int n) {
        boolean found = false;

        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                
                long product = 1;
                for (int m = i; m <= j; m++) {
                    product *= arr[m];
                }
                
                if (isPrime(product)) {
                    found = true;
                    for (int m = i; m <= j; m++) {
                        System.out.print(arr[m] + " ");
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