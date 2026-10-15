import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }
        printAbsoluteDifference(a, b, n, m);
    }

    public static void printAbsoluteDifference(int[] a, int[] b, int n, int m) {

        long sumA = 0;
        for (int i = 0; i < n; i++) {
            sumA += a[i];
        }
        
        long sumB = 0;
        for (int i = 0; i < m; i++) {
            sumB += b[i];
        }

        long diff = Math.abs(sumA - sumB);
        System.out.println(diff);
    }
}