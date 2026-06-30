import java.util.Scanner;

public class Main {

    public static void nonRepeatingEle(int[] arr, int n){
        for(int i=0; i<n; i++){
            boolean isNonRepeating = true;
            if(i>0 && arr[i] == arr[i-1]){
                isNonRepeating = false;
            }
            if(i<n-1 && arr[i]==arr[i+1]){
                isNonRepeating = false;
            }

            if(isNonRepeating){
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i]=scanner.nextInt();
        }

        nonRepeatingEle(arr, N);
        
}
}