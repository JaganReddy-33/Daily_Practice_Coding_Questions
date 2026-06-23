import java.util.Scanner;

public class Main {

    public static void indexOfLargestEle(int[] arr){
        int largeIndex = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i] > arr[largeIndex]){
                largeIndex = i;
            }
        }
        System.out.print(largeIndex);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr =new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }

        indexOfLargestEle(arr);
        
    }
}