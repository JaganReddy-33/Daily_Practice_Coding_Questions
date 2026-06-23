import java.util.Scanner;

public class Main {

    public static void countLargestEle(int[] arr){
        int largestVal = arr[arr.length-1];
        int count = 1;
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i] == largestVal){
                count++;
            }
        }
        System.out.print(count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i]=scanner.nextInt();
        }

        countLargestEle(arr);
        
    }
}