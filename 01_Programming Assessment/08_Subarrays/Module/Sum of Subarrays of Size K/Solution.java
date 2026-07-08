import java.util.Scanner;

public class Main {

    static void sumOfSubarrays(int[] arr,int size){

        for(int i=0; i<=arr.length-size; i++){
            int sum = 0;
            int end = i+size-1;
            for(int j=i; j<=end; j++){
                sum += arr[j];
            }
            System.out.print(sum+" ");
        }
    
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        sumOfSubarrays(arr,size);
    }
}