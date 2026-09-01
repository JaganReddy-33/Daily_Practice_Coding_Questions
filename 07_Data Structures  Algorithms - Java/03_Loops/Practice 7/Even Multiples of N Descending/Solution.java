import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        printEvenMultiplesDescending(n, m);
    }

    static void printEvenMultiplesDescending(int n, int m) {
        for (int i = m; i >= 1; i--) {
            if (i % n == 0 && i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}