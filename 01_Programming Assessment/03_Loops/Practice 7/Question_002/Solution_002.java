import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        printEvenMultiples(n, m);
    }

    public static void printEvenMultiples(int n, int m) {
        for (int i = n; i <= m; i+=n) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}