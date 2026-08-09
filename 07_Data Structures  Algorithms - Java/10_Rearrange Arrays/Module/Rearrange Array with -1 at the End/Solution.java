import java.util.Scanner;

public class Main {

    public static void rearrangeArr(int[] arr, int n){
        int k = 0;
        for(int i=0; i<n; i++){
            if(arr[i] != -1){
                arr[k++] = arr[i];
            }
        }

        while(k < n){
            arr[k++] = -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }

        rearrangeArr(arr, n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}