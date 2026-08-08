import java.util.Scanner;

public class Main {

    static void sumOfSubarrays(int[] arr,int k, int n){
        int sum = 0;
        for(int i=0; i<k; i++){
            sum += arr[i];
        }
        System.out.print(sum+" ");
        for(int i=k; i<n; i++){
            sum = sum - arr[i-k] + arr[i];
            System.out.print(sum+" ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        sumOfSubarrays(arr, k, n);
    }
}