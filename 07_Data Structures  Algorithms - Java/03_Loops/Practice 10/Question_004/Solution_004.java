import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(countEvenDigits(n));
    }

    public static int countEvenDigits(int n) {
        int count = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                count++;
            }
            n /= 10;
        }
        return count;
    }
}