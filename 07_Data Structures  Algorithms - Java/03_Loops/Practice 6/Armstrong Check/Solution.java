import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(isArmstrong(N) ? "Armstrong" : "Not Armstrong");
    }

    public static boolean isArmstrong(int N) {
        int temp = N;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        temp = N;
        long sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp /= 10;
        }
        return sum == N;
    }
}