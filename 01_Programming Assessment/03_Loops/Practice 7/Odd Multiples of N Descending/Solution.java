import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        printOddMultiplesDescending(n, m);
    }

    public static void printOddMultiplesDescending(int n, int m) {
        boolean found = false;
        int start = (m / n) * n;

        for (int i = start; i >= n; i -= n) {
            if (i % 2 != 0) {
                System.out.print(i+" ");
                found = true;
            }
        }

        if (!found) {
            System.out.print("-1");
        }
    }
}