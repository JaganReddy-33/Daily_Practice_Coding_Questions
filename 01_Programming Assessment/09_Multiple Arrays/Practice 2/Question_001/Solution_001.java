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

        printMergeSortedArraysOdd(a, b, n, m);
    }

    public static void printMergeSortedArraysOdd(int[] a, int[] b, int n, int m){
        int i = 0;
        int j = 0;

        while(i<n && j<m){
            boolean aIsOdd = (a[i]%2 != 0);
            boolean bIsOdd = (b[j]%2 != 0);

            if(!aIsOdd){
                i++;
            } else if(!bIsOdd){
                j++;
            } else {
                if(a[i] <= b[j]){
                    System.out.print(a[i] + " ");
                    i++;
                } else {
                    System.out.print(b[j] + " ");
                    j++;
                }
            }
        }

        while(i < n){
            if(a[i]%2 != 0){
                System.out.print(a[i] + " ");
            }
            i++;
        }

        while(j < m){
            if(b[j]%2 != 0){
                System.out.print(b[j] + " ");
            }
            j++;
        }
    }
}