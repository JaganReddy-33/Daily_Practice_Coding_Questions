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

        printMergeSortedArraysDesc(a, b, n, m);
    }

    public static void printMergeSortedArraysDesc(int[] a, int[] b, int n, int m) {
        int i = n-1;
        int j = m-1;

        while(i >= 0 && j>= 0){
            if(a[i] >= b[j]){
                System.out.print(a[i] + " ");
                i--;
            } else {
                System.out.print(b[j] + " ");
                j--;
            }
        }

        while(i >= 0){
            System.out.print(a[i] + " ");
            i--;
        }

        while(j >= 0){
            System.out.print(b[j] + " ");
            j--;
        }
    }
}