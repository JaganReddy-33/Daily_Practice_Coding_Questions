import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }

        int k=scanner.nextInt();

        printCounterLesserThanKPrime(arr, n, k);
    }

    public static void printCounterLesserThanKPrime(int[] arr, int n, int k){
        int count = 0;
        for(int i=0; i<n; i++){
            if(arr[i] < k && isPrime(arr[i])){
                count++;
            }
        }
        System.out.print(count);
    }

    public static boolean isPrime(int num){
        if(num <= 1) return false;

        for(int i=2; i*i <= num; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}