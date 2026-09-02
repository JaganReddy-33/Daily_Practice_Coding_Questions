import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printSumOfFirstAndLastDigit(n);
    }

    public static void printSumOfFirstAndLastDigit(int n) {
        int lastDigit = n % 10;
        int firstDigit = n;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }
        System.out.println(firstDigit + lastDigit);
    }
}