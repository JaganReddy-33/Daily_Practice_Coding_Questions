import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int[] b = new int[m];
        for(int i=0; i<m; i++){
            b[i] = sc.nextInt();
        }

        int p = sc.nextInt();
        int q = sc.nextInt();

        printMergeSortedOrder(a, b, n, m, p, q);    
    }

    public static void printMergeSortedOrder(int[] a, int[] b, int n, int m, int p, int q) {

        int[] merged = new int[n+m];
        int idx = 0;

        for(int i=0; i<n; i++){
            merged[idx++] = a[i];
        }
        for(int i=0; i<m; i++){
            merged[idx++] = b[i];
        }

        Arrays.sort(merged);

        StringBuilder sbA = new StringBuilder();
        for(int i=0; i<p; i++){
            sbA.append(merged[i]).append(" ");
        }

        StringBuilder sbB = new StringBuilder();
        for(int i=p; i<p+q; i++){
            sbB.append(merged[i]).append(" ");
        }

        System.out.print(sbA.toString().trim());
        System.out.print(sbB.toString().trim());
    }
}