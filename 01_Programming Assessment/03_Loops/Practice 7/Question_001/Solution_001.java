import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        printLastSecondDigit(n);
    }

    public static void printLastSecondDigit(long n) {
        long secondLastDigit = (n / 10) % 10;
        System.out.println(secondLastDigit);
    }
}