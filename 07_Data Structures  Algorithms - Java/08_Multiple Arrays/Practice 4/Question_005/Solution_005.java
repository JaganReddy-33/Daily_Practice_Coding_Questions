import java.util.*;

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

        printZigzagMerge(a, b, n, m);
    }

    public static void printZigzagMerge(int[] a, int[] b, int n, int m) {
        int i=0, j=0;

        while(i<n && j<m) {
            System.out.print(a[i] + " ");
            System.out.print(b[j] + " ");
            i++;
            j++;
        }

        while(i<n) {
            System.out.print(a[i]+" ");
            i++;
        }
        while(j<m) {
            System.out.print(b[j] + " ");
            j++;
        }
    }
}