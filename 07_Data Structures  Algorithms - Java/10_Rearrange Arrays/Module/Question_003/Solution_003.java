import java.util.Scanner;

public class Main {

    public static void rearrangeArr(int[] arr, int n){

        int[] temp = new int[n];
        for(int i=0; i<n; i++){
            temp[i]=arr[i];
        }
        
        int posIdx = 0;
        for(int i=0; i<n; i++){
            if(temp[i] >= 0){
                arr[posIdx++] = temp[i];
            }
        }

        for(int i=0; i<n; i++){
            if(temp[i] < 0){
                arr[posIdx++] = temp[i];
            }
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