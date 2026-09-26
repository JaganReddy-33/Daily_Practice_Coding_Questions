
import java.util.Scanner;

public class Main {

    public static void pairWithDiffKval(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(Math.abs(arr[i]-arr[j]) == target){
                    System.out.print(arr[i]+" "+arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }

        int target = scanner.nextInt();

        pairWithDiffKval(arr, target);
    }

}