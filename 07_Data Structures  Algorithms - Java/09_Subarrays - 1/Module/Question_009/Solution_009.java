import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void longestSubarray(int[] arr, int n, int k){
        int maxLen = 0;
        int start = -1;
        int end = -1;

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum += arr[j];

                if(sum == k){
                    int currentLen = j-i+1;
                    if(currentLen > maxLen){
                        maxLen = currentLen;
                        start = i;
                        end = j;
                    }
                }
            }
        }

        if(maxLen > 0){
            for(int p=start; p<=end; p++){
                System.out.print(arr[p]+" ");
            }
            System.out.println();
        } else {
            System.out.println("No sua")
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n =scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }

        longestSubarray(arr, n, k);
    }
}