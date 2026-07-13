import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean foundPrime = false;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (isPrime(arr[i])) {
                sb.append(arr[i]).append(" ");
                foundPrime = true;
            }
        }
        if (foundPrime) {
            System.out.println(sb.toString().trim());
        } else {
            System.out.println("No prime elements found");
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}