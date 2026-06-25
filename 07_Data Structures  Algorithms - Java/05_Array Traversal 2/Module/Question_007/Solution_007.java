import java.util.Scanner;

public class Main {

    public static void findMinPairSum(int[] arr){
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min1){
                min2 = min1;
                min1 = arr[i];
            } else if(arr[i]<min2){
                min2 = arr[i];
            }
        }
        System.out.print(min1+min2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }

        findMinPairSum(arr);
    }
}