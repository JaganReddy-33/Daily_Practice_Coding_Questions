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
        printMergeSortedArraysEven(a, b, n, m);
    }

    public static void printMergeSortedArraysEven(int[] a, int[] b, int n, int m) {

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
        
        for (int j = 0; j < m; j++) {
            if (b[j] % 2 == 0) {
                System.out.print(b[j] + " ");
            }
        }
    }
}