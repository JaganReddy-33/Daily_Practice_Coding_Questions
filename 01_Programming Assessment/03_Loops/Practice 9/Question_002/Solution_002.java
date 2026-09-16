import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printProductOfDigits(n);
    }

    public static void printProductOfDigits(int n) {
        int product = 1;
        while (n > 0) {
            product *= (n % 10);
            n /= 10;
        }
        System.out.println(product);
    }
}