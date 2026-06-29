import java.util.Scanner;

public class Main {

    public static void largestRepeatingEle(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                if(arr[i] > largest){
                    largest = arr[i];
                }
            }
        }
        System.out.print(largest);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }

        largestRepeatingEle(arr);
       
    }
}