import java.util.Scanner;

public class Main {

    public static void indexOfSmallEle(int[] arr){
        int smallIdx = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i] < arr[smallIdx]){
                smallIdx = i;
            }
        }
        System.out.print(smallIdx);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        indexOfSmallEle(arr);
       
    }
}