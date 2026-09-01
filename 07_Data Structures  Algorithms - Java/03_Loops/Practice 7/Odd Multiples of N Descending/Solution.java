import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        printOddMultiplesDescending(n, m);
    }

    static void printOddMultiplesDescending(int n, int m) {
        boolean found = false;
        for (int i = m; i >= 1; i--) {
            if (i % n == 0 && i % 2 != 0) {
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