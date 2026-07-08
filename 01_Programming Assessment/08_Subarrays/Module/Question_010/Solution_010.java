import java.util.Scanner;

public class Main {

    public static void longestSubarray(int[] arr, int n, int k){
        int minLen = Integer.MAX_VALUE;
        int start =-1;
        int end = -1;

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum +=arr[j];
                if(sum == k){
                    int len = j-i+1;
                    if(len < minLen){
                        minLen = len;
                        start = i;
                        end = j;
                    }
                }
            }
        }
        if(start == -1){
            System.out.print("No subarray found.");
        } else {
            for(int m=start; m<=end; m++){
                System.out.print(arr[m]+" ");
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k=scanner.nextInt();
        int n=scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }

        longestSubarray(arr, n, k);
    }
}