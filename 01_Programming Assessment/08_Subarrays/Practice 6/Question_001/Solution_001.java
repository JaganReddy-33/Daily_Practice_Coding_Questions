import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        printLongestPrimeProductSubarray(arr, n);
    }

    public static void printLongestPrimeProductSubarray(int[] arr, int n) {
        int maxLen = 0;
        int start = -1;
        int end = -1;

        for(int i=0; i<n; i++){
            long prod = 1;
            for(int j=i; j<n; j++){
                prod *= arr[j];


                if(isPrime(prod)){
                    int currLen = j-i+1;
                    if(currLen > maxLen){
                        maxLen = currLen;
                        start = i;
                        end = j;
                    }
                }
            }
        }
        if(maxLen == 0){
            System.out.print("None");
        } else {
            for(int m=start; m<=end; m++){
                System.out.print(arr[m] + " ");
            }
        }
    }

    public static boolean isPrime(long num) {
        if(num <= 1) return false;

        for(long i=2; i*i<=num; i++){
            if(num%i == 0) return false;
        }
        return true;
    }
}