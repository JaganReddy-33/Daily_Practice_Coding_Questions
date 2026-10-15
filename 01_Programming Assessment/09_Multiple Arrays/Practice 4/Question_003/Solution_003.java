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

        printSumOfPrimeEle(a, b, n, m);
    }

    public static void printSumOfPrimeEle(int[] a, int[] b, int n, int m) {
        int sum = 0;

        for(int i=0; i<n; i++){
            if(isPrime(a[i])){
                sum += a[i];
            }
        }

        for(int j=0; j<m; j++){
            if(isPrime(b[j])){
                sum += b[j];
            }
        }

        System.out.print(sum);
    }

    public static boolean isPrime(int num){
        if(num <= 1) return false;

        for(int i=2; i*i<=num; i++){
            if(num%i == 0) return false;
        }
        return true;
    }
}