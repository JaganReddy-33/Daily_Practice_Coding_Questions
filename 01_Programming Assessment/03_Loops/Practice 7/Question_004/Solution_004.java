import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        printEvenMultiplesDescending(n, m);
    }

    public static void printEvenMultiplesDescending(int n, int m) {
        int start = (m / n) * n;

        for (int i = start; i >= n; i -= n) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }
        }
    }
}