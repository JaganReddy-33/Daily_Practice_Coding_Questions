import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = scanner.nextInt();
        }

        int[] b = new int[m];
        for(int i=0; i<m; i++){
            b[i] = scanner.nextInt();
        }

        reverseMergeArrays(a, b, n, m);
    }

    public static void reverseMergeArrays(int[] a, int[] b, int n, int m) {
        for(int i=m-1; i>=0; i--){
            System.out.print(b[i]+" ");
        }

        for(int i=n-1; i>=0; i--){
            System.out.print(a[i]+" ");
        }
    }
}