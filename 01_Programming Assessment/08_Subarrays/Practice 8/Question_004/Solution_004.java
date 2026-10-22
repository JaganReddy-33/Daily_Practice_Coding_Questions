import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();       
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        printPrimeExtremesSubarrays(arr, n);
    }

    public static void printPrimeExtremesSubarrays(int[] arr, int n) {
        boolean found = false;

        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                
                int minVal = arr[i];
                int maxVal = arr[i];
                for (int m = i + 1; m <= j; m++) {
                    if (arr[m] < minVal) {
                        minVal = arr[m];
                    }
                    if (arr[m] > maxVal) {
                        maxVal = arr[m];
                    }
                }
                
                if (isPrime(minVal) && isPrime(maxVal)) {
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