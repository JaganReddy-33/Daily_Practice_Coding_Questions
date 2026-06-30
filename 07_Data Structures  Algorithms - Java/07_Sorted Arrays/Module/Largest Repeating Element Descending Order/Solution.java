import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i]=scanner.nextInt();
        }

        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                System.out.print(arr[i]);
                return;
            }
        }
        System.out.print(-1);
        
    }
}