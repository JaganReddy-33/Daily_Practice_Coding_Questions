import java.util.Scanner;

class Main {

    public static void primeSubarray(int[] arr, int n) {
        boolean found = false;

        for (int len=1; len<=n; len++) {
            int sum = 0;
            for(int k=0; k<len; k++){
                sum += arr[k];
            }

            if(isPrime(sum)){
                found = true;
                printSubarray(arr, 0, len-1);
            }

            for(int i=1; i<=n-len; i++){
                sum = sum - arr[i-1] + arr[i+len-1];

                if(isPrime(sum)){
                    found = true;
                    printSubarray(arr, i, i+len-1);
                }
            }
        }

        if (!found) {
            System.out.println("None");
        }
    }

    private static void printSubarray(int[] arr, int start, int end){
        for(int k=start; k<=end; k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }

    private static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i=2; i*i<=num; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }

        primeSubarray(arr, n);
    }
}