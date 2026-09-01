import java.util.Scanner;

class Main {
    static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    static boolean isArmstrong(int n) {
        int digits = countDigits(n);
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == n;
    }

    static void printArmstrongNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printArmstrongNumbers(n);
    }
}