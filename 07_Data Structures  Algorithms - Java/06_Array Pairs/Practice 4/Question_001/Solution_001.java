import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] =scanner.nextInt();
        }

        printPairsWithPrimeProduct(arr, n);
    }

    public static void printPairsWithPrimeProduct(int[] arr, int n){
        boolean found = false;

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                long prod = (long) arr[i] * arr[j];

                if(isPrime(prod)){
                    System.out.println(arr[i] + " " + arr[j]);
                    found = true;
                }
            }
        }
        if(!found){
            System.out.println("No pairs found");
        }
    }

    public static boolean isPrime(long num){
        if(num <= 1) return false;

        for(long i=2; i*i<=num; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}