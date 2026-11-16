import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] b = new int[m];
        for(int i=0; i<m; i++) {
            b[i] = scanner.nextInt();
        }

        printAbsProductDiff(a, b, n, m);
    }

    public static void printAbsProductDiff(int[] a, int[] b, int n, int m) {
        int prodA = 1;
        for(int i=0; i<n; i++) {
            prodA *= a[i];
        }

        int prodB = 1;
        for(int i=0; i<m; i++) {
            prodB *= b[i];
        }

        int diff = Math.abs(prodA - prodB);
        System.out.print(diff);
    }
}