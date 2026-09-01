import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (isPrimeProduct(N)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

    public static boolean isPrimeProduct(int n) {
        long prod = 1;
        while (n > 0) {
            prod *= (n % 10);
            n /= 10;
        }
        if (prod <= 1) {
            return false;
        }
        for (long i = 2; i * i <= prod; i++) {
            if (prod % i == 0) {
                return false;
            }
        }
        return true;
    }
}