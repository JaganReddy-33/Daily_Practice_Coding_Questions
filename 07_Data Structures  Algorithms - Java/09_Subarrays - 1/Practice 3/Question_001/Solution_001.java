import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }

        printSubarraysPrimeDiff(arr, n);
    }

    public static void printSubarraysPrimeDiff(int[] arr, int n) {
        boolean found = false;

        for(int len=1; len<=n; len++) {
            for(int i=0; i<=n-len; i++) {
                int j = i+len-1;

                int maxVal = arr[i];
                int minVal = arr[i];
                for(int m=i; m<=j; m++) {
                    maxVal = Math.max(maxVal, arr[m]);
                    minVal = Math.min(minVal, arr[m]);
                }
                if(isPrime(maxVal - minVal)) {
                    for(int k=i; k<=j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                    found = true;
                }
            }
        }

        if(!found) {
            System.out.print("None");
        }
    }

    public static boolean isPrime(int num) {
        if(num <= 1) return false;
        for(int i=2; i*i<=num; i++) {
            if(num%i == 0) return false;
        }
        return true;
    }
}