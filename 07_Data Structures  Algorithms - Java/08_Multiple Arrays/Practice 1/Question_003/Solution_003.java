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
        for(int i=0; i<m; i++){
            ar2[i] = scanner.nextInt();
        }

        printMergeSortedArraysDesc(ar1, ar2, n, m);
    }

    public static void printMergeSortedArraysDesc(int[] ar1, int[] ar2, int n, int m) {
        int i=n-1, j=m-1;

        while(i >= 0 && j >= 0) {
            if(ar1[i] >= ar2[j]) {
                System.out.print(ar1[i] + " ");
                i--;
            } else {
                System.out.print(ar2[j] + " ");
                j--;
            }
        }

        while(i >= 0) {
            System.out.print(ar1[i] + " ");
            i--;
        }

        while(j >= 0) {
            System.out.print(ar2[j] + " ");
            j--;
        }
    }
}