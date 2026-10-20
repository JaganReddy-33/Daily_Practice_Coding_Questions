import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        printSmallestPrimeProductSubarray(arr, n);
    }

    public static void printSmallestPrimeProductSubarray(int[] arr, int n) {
        int minLength = Integer.MAX_VALUE;
        int bestStart = -1;
        int bestEnd = -1;

        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                
                long product = 1;
                for (int m = i; m <= j; m++) {
                    product *= arr[m];
                }
                
                if (isPrime(product)) {
                    int currentLength = j - i + 1;
                    if (currentLength < minLength) {
                        minLength = currentLength;
                        bestStart = i;
                        bestEnd = j;
                    }
                }
            }
            if (minLength != Integer.MAX_VALUE) {
                break;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            System.out.print("None");
        } else {
                for (int k = bestStart; k <= bestEnd; k++) {
                System.out.print(arr[k] + " ");
            }
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