import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        printSquareOfPrimeNums(arr, n);
    }

    public static void printSquareOfPrimeNums(int[] arr, int n){
        boolean found = false;

        for(int i=0; i<n; i++){
            if(arr[i] >= 0){
                long sqrt = (long) Math.sqrt(arr[i]);

                if(sqrt*sqrt == arr[i]){
                    if(isPrime(sqrt)){
                        System.out.print(arr[i] + " ");
                        found = true;
                    }
                }
            }
        }

        if(!found){
            System.out.print("-1");
        }
    }

    public static boolean isPrime(long num) {
        if(num <= 1) return false;

        for(long i=2; i*i <= num; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
}