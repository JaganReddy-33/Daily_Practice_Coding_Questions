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
        int p = scanner.nextInt();
        int q = scanner.nextInt();

        printMergeSortedOrder(a, b, n, m, p, q);
    }

    public static void printMergeSortedOrder(int[] a, int[] b, int n, int m, int p, int q) {
        int[] merged = new int[n+m];
        int i=0, j=0, k=0;

        while(i<n && j<m) {
            if(a[i] < b[j]) {
                merged[k++] = a[i++];
            } else {
                merged[k++] = b[j++];
            }
        }

        while(i < n) {
            merged[k++] = a[i++];
        }

        while(j < m) {
            merged[k++] = b[j++];
        }

        StringBuilder sbA = new StringBuilder();
        for(int x=0; x<p; x++) {
            sbA.append(merged[x]).append(" ");
        }
        System.out.print(sbA.toString());

        StringBuilder sbB = new StringBuilder();
        for(int y=p; y<p+q; y++) {
            sbB.append(merged[y]).append(" ");
        }
        System.out.print(sbB.toString());
    }
}