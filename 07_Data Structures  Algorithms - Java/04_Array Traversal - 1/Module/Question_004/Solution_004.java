import java.util.Scanner;
public class Main {

    public static void absoluteSum(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + Math.abs(arr[i]);
        }
        System.out.print(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        absoluteSum(arr);
    }
}