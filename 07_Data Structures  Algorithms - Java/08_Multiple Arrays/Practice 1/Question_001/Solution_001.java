import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] ar1 = new int[n];
        for(int i=0; i<n; i++){
            ar1[i] = scanner.nextInt();
        }

        int[] ar2 = new int[m];
        for(int j=0; j<m; j++){
            ar2[j] = scanner.nextInt();
        }

        printReverseMergeArrays(ar1, ar2, n, m);
    }

    public static void printReverseMergeArrays(int[] ar1, int[] ar2, int n, int m) {
        for(int i=m-1; i>=0; i--) {
            System.out.print(ar2[i] + " ");
        }

        for(int i=n-1; i>=0; i--) {
            System.out.print(ar1[i] + " ");
        }
    }
}