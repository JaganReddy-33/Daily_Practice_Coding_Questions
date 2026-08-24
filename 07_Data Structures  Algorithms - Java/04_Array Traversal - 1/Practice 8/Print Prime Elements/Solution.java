import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        printPrimeElements(arr);
    }

    public static void printPrimeElements(int[] arr) {
        boolean foundPrime = false;
        for (int num : arr) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                foundPrime = true;
            }
        }
        if (!foundPrime) {
            System.out.print("No prime elements found");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}