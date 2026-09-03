import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sumPrimeDigits(n));
    }

    public static int sumPrimeDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                sum += digit;
            }
            n /= 10;
        }
        return sum;
    }
}