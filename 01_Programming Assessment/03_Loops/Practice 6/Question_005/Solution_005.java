import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        checkPrimeProductDigits(n);
    }

    public static void checkPrimeProductDigits(long n) {
        long product = 1;
        long temp = n;
        while (temp > 0) {
            long digit = temp % 10;
            product *= digit;
            temp /= 10;
        }

        if (isPrime(product)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
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