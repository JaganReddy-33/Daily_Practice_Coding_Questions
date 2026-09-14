import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        printOddMultiples(n, m);
    }

    public static void printOddMultiples(int n, int m) {
        boolean found = false;

        for (int i = n; i <= m; i += n) {
            if (i % 2 != 0) {
                System.out.print(i);
                found = true;
            }
        }

        if (!found) {
            System.out.print("-1");
        }
    }
}