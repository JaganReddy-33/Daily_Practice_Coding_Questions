import java.util.Scanner;

public class Main {

    public static void smallestEleCountOccur(int[] arr, int n){
        int count = 1;
        for(int i=0; i<n-1; i++){
            if(arr[i] == arr[i+1]){
                count++;
            } else {
                System.out.print(count);
                return;
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

        smallestEleCountOccur(arr, N);
        
    }
}