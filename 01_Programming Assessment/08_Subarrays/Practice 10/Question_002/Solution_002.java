import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        printLargestKSumSubarray(arr, n, k, m);
    }
    public static void printLargestKSumSubarray(int[] arr, int n, int k, int m) {
        for(int len=n; len>m; len--){
            for(int i=0; i<=n-len; i++){
                int j = i+len-1;

                long sum = 0;
                for(int x=i; x<=j; x++){
                    sum += arr[x];
                }

                if(sum == k){
                    for(int x=i; x<=j; x++){
                        System.out.print(arr[x] + " ");
                    }
                    System.out.println();
                    return;
                }
            }
        }
        System.out.print("None");
    }
}