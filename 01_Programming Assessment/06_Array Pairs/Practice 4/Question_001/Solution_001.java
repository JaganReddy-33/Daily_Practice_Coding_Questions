import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        findPairsWithPrimeProduct(arr, n);
    }

    public static void findPairsWithPrimeProduct(int[] arr, int n) {
        boolean found = false;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                long product = (long) arr[i] * arr[j];
                if (isPrime(product)) {
                    System.out.println(arr[i] + " " + arr[j]);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No pairs found");
        }
    }

    public static boolean isPrime(long num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (long i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}