import java.util.Scanner;

public class Main {

    public static void rearrangeAtEnd(int[] arr, int n){
        int idx = 0;
        for(int i=0; i<n; i++){
            if(arr[i] >= 0){
                arr[idx] = arr[i];
                idx++;
            }
        }
        while(idx < n){
            arr[idx] = -1;
            idx++;
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }

        rearrangeAtEnd(arr, n);
    }
}