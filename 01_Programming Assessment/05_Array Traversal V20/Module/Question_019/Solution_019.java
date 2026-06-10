import java.util.Scanner;
public class Main {

    public static void reverseEvenElements(int[] arr){
        for(int i=arr.length; i>=0; i--){
            if(arr[i]%2 == 0){
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        reverseEvenElements(arr);
    }
}