import java.util.Scanner;

public class Main {

    public static void smallestRepeatingEle(int[] arr){
        for(int i=arr.length-1; i>0; i--){
            if(arr[i-1] == arr[i]){
                System.out.print(arr[i]);
                return;
            }
        }
        System.out.print(-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i]=scanner.nextInt();
        }

        smallestRepeatingEle(arr);
    }
}