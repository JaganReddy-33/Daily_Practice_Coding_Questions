import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }

        printSmallestPrimeDiffSubarray(arr, n);
    }

    public static void printSmallestPrimeDiffSubarray(int[] arr, int n) {
        int minLen = Integer.MAX_VALUE;
        int start = -1;
        int end = -1;

        for(int i=0; i<n; i++){
            int minVal = arr[i];
            int maxVal = arr[i];

            for(int j=i; j<n; j++){
                minVal = Math.min(minVal, arr[j]);
                maxVal = Math.max(maxVal, arr[j]);

                if(isPrime(maxVal - minVal)){
                    int currLen = j-i+1;
                    if(currLen < minLen){
                        minLen = currLen;
                        start = i;
                        end = j;
                    }
                } 
            }
        }
        if(minLen == Integer.MAX_VALUE){
            System.out.print("None");
        } else {
            for(int k=start; k<=end; k++){
                System.out.print(arr[k] + " ");
            }
        }
    }

    public start boolean isPrime(int num) {
        if(num <= 1) return false;

        for(int i=2; i*i<=num; i++){
            if(num%i == 0) return false;
        }
        return true;
    }
}