import java.util.Scanner;

public class Main {

    public static void smallestSubarray(int[] arr, int n, int k){
        int minLen = Integer.MAX_VALUE;
        int start = -1;
        int end = -1;
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum += arr[j];

                if(sum == k){
                    int currLen = j-i+1;
                    if(currLen < minLen){
                        minLen = currLen;
                        start = i;
                        end = j;
                    }
                }
            }
        }

        if(minLen != Integer.MAX_VALUE){
            for(int p=start; p<=end; p++){
                System.out.print(arr[p]+" ");
            }
        } else {
            System.out.print("No subarray found.");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k =scanner.nextInt();
        int n=scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        
        smallestSubarray(arr, n, k);
    }
}