import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        printSubarraysprimeDiff(arr, n);
    }

    public static void printSubarraysprimeDiff(int[] arr, int n) {
        boolean found = false;

        for(int len=1; len<=n; len++) {
            for(int i=0; i<=n-len; i++){
                int j = i+len-1;

                int minVal = arr[i];
                int maxVal = arr[i];
                for(int m=i; m<=j; m++){
                    minVal = Math.min(minVal, arr[m]);
                    maxVal = Math.max(maxVal, arr[m]);
                }

                if(isPrime(maxVal - minVal)){
                    for(int m=i; m<=j; m++){
                        System.out.print(arr[m]+" ");
                    }
                    System.out.println();
                    found = true;
                }
            }
        }
        if(!found){
            System.out.print("None");
        }
    }

    public static boolean isPrime(int num){
        if(num <= 1) return false;

        for(int i=2; i*i<=num; i++){
            if(num%i == 0) return false;
        }
        return true;
    }
}