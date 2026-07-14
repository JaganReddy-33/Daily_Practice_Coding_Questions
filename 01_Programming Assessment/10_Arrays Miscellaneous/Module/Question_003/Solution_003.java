import java.util.Scanner;

public class Main {

    public static void rearrangePosandNegEle(int[] arr, int n){
        int[] temp = new int[n];
        int idx = 0;
        for(int i=0; i<n; i++){
            if(arr[i]>=0){
                temp[idx] = arr[i];
                idx++;
            }
        }

        for(int i=0; i<n; i++){
            if(arr[i]<0){
                temp[idx] = arr[i];
                idx++;
            }
        }

        for(int i=0; i<n; i++){
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }

        rearrangePosandNegEle(arr, n);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}