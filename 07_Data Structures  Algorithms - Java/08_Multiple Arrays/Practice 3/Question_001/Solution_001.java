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

        printAbsoluteDiff(a, b, n, m);
    }

    public static void printAbsoluteDiff(int[] a, int[] b, int n, int m) {
        int sumA = 0;
        for(int i=0; i<n; i++) {
            sumA += a[i];
        }

        int sumB = 0;
        for(int i=0; i<m; i++) {
            sumB += b[i];
        }

        int diff = Math.abs(sumA - sumB);
        System.out.print(diff);
    }
}