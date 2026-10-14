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

        printMergeSortedArrays(a, b, n, m);
    }

    public static void printMergeSortedArrays(int[] a, int[] b, int n, int m) {
        int i = 0;
        int j = m-1;

        while(i < n && j>=0) {
            if(a[i] <= b[j]){
                System.out.print(a[i]+" ");
                i++;
            } else {
                System.out.print(b[j]+" ");
                j--;
            }
        }

        while(i < n){
            System.out.print(a[i] + " ");
            i++;
        }

        while(j >= 0){
            System.out.print(b[j] + " ");
            j--;
        }
    }
}