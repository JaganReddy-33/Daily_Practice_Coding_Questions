import java.util.Scanner;
public class Main {

    public static void sumPositiveNegative(int[] arr){
        int sumPos = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                sumPos +=arr[i];
            }
        }
        System.out.print(sumPos);

        int sumNeg = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < 0){
                sumNeg +=arr[i];
            }
        }
        System.out.print(sumNeg);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }
        sumPositiveNegative(arr);
    }
}