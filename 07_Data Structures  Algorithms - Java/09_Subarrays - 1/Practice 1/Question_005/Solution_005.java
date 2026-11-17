import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }

        printSmallestPrimeSumSubarrays(arr, n);
    }

    public static void printSmallestPrimeSumSubarrays(int[] arr, int n) {
        for(int len=1; len<=n; len++) {
            for(int i=0; i<=n-len; i++) {
                int j=i+len-1;
                int currSum = 0;
                for(int k=i; k<=j; k++) {
                    currSum += arr[k];
                }

                if(isPrime(currSum)) {
                    for(int k=i; k<=j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    return;
                }
            }
        }
        System.out.print("None");
    }

    public static boolean isPrime(int num) {
        if(num<=1) return false;
        for(int i=2; i*i<=num; i++) {
            if(num%i == 0) return false;
        }
        return true;
    }
}