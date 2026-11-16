import java.util.Scanner;
import java.util.ArrayList;

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

        printMergePrimes(a, b, n, m);
    }

    public static void printMergePrimes(int[] a, int[] b, int n, int m) {
        boolean found = false;

        for(int i=0; i<n; i++) {
            if(isprime(a[i])) {
                System.out.print(a[i] + " ");
                found = true;
            }
        }

        for(int i=0; i<m; i++) {
            if(isprime(b[i])) {
                System.out.print(b[i] + " ");
                found = true;
            }
        }

        if(!found) {
            System.out.print("None");
        }
    }

    public static boolean isprime(int num) {
        if(num <= 1) return false;
        for(int i=2; i*i<=num; i++) {
            if(num%i == 0) return false;
        }
        return true;
    }
}