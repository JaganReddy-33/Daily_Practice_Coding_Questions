import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(getLastSecondDigit(N));
    }

    public static int getLastSecondDigit(int n) {
        return (n / 10) % 10;
    }
}