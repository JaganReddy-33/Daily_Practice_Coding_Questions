import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        printStrongNumbers(n);
    }

    public static void printStrongNumbers(int n) {
        boolean found = false;
        for (int i = 1; i <= n; i++) {
            if (isStrong(i)) {
                System.out.print(i + " ");
                found = true;
            }
        }
        
        if (!found) {
            System.out.print("No strong numbers");
        }
    }

    public static boolean isStrong(int num) {

        int temp = num;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }

    public static int factorial(int num) {

        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}