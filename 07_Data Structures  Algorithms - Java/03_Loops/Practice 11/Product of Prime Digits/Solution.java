import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        productOfPrimeDigits(n);
    }

    public static void productOfPrimeDigits(int n) {
        boolean found = false;
        int product = 1;
        while (n > 0) {
            int digit = n % 10;
            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                product *= digit;
                found = true;
            }
            n /= 10;
        }
        if (found) {
            System.out.println(product);
        } else {
            System.out.println("No prime digits");
        }
    }
}