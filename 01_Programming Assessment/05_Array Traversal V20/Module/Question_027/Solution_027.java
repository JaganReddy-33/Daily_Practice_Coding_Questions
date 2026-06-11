import java.util.Scanner;

public class Main {

    public static void smallestRepeatingEle(int[] arr){
        
        for(int i=arr.length-1; i>0; i--){
            if(arr[i-1] == arr[i]){
                System.out.print(arr[i]);;
                return;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] =scanner.nextInt();
        }

        smallestRepeatingEle(arr);
       
    }
}