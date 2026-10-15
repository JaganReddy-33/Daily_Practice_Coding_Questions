import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if(!sc.hasNextInt()) return;
        int n =sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int[] b = new int[m];
        for(int i=0; i<m; i++){
            b[i] = sc.nextInt();
        }

        printZigzagMerge(a, b, n, m);
    }

    public static void printZigzagMerge(int[] a, int[] b, int n, int m) {
        int i=0;
        int j=0;

        while(i<n && j<m){
            System.out.print(a[i] + " ");
            System.out.print(b[j] + " ");
            i++;
            j++;
        }

        while(i<n){
            System.out.print(a[i] + " ");
            i++;
        }

        while(j<m){
            System.out.print(b[j] + " ");
            j++;
        }
    }
}