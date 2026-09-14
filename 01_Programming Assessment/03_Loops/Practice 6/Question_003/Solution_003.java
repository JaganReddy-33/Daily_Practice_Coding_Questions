import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printArmstrongNumbers(n);
    }

    public static void printArmstrongNumbers(int n) {
        boolean first = true;
        for (int i = 1; i <= n; i++) {
            if (isArmstrong(i)) {
                if (!first) {
                    System.out.print(" ");
                }
                System.out.print(i);
                first = false;
            }
        }
    }

    public static boolean isArmstrong(int num) {
        int temp = num;
        int digits = 0;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = num;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == num;
    }
}