import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        printEvenMultiples(n, m);
    }

    static void printEvenMultiples(int n, int m) {
        for (int i = n; i <= m; i += n) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}