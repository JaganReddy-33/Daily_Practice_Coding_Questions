import java.util.Scanner;

public class Main {

    public static void pairWithMinSum(int[] arr){
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int idx1= -1;
        int idx2 = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min1){
                min2 = min1;
                min1 = arr[i];
                idx1 = i;
            } else if(arr[i] < min2) {
                min2 = arr[i];
                idx2 = i;
            }
        }

        if(idx1 < idx2){
            System.out.println(arr[idx1]+" "+arr[idx2]);
        } else {
            System.out.println(arr[idx2]+" "+arr[idx1]);
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i]=scanner.nextInt();
        }

        pairWithMinSum(arr);
        
    }
}