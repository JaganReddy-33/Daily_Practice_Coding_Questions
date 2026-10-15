import java.util.Scanner;
import java.util.ArrayList;

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

        printMergePrime(a, b, n, m);
    }

    public static void printMergePrime(int[] a, int[] b, int n, int m) {
        int primeCount = 0;

        for(int i=0; i<n; i++){
            if(isPrime(a[i])){
                System.out.print(a[i]+ " ");
                primeCount++;
            }
        }

        for(int j=0; j<m; j++){
            if(isPrime(b[j])){
                System.out.print(b[j] + " ");
                primeCount++;
            }
        }

        if(primeCount == 0){
            System.out.print("None");
        }
    }

    public static boolean isPrime(int num) {
        if(num <= 1) return false;

        for(int i=2; i*i<=num; i++){
            if(num%i == 0) return false;
        }
    }
}