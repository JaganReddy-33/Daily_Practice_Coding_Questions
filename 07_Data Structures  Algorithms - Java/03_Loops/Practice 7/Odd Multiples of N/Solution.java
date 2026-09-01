import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        printOddMultiples(n, m);
    }

    static void printOddMultiples(int n, int m) {
        boolean found = false;
        for (int i = n; i <= m; i += n) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print(-1);
        }
        System.out.println();
    }
}