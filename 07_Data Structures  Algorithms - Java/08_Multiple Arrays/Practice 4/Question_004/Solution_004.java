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

        printMergeInPlace(a, b, n-m, m);
        for(int i=0; i<n; i++) {
            System.out.print(a[i] + )
        }
    }

    public static void printMergeInPlace(int[] a, int[] b, int n, int m) {
        int i=n-1;
        int j=m-1;
        int k = n+m-1;

        while(i >= 0 && j>=0) {
            a[k--] = (a[i] > b[j]) ? a[i--] : b[j--];
        }

        while(j >= 0) {
            a[k--] = b[j--];
        }
    }
}