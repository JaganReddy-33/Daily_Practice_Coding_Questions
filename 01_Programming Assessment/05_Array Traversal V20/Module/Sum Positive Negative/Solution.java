import java.util.Scanner;
public class Main {

    public static int printPositiveNumbersSum(int[] arr){
        int positiveSum = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                positiveSum += arr[i];
            }
        }
        return positiveSum;
    }

    public static int printNegativeNumbersSum(int[] arr){
        int negativeSum = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < 0){
                negativeSum += arr[i];
            }
        }
        return negativeSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        int res = printPositiveNumbersSum(arr);
        System.out.println(res);
        int result = printNegativeNumbersSum(arr);
        System.out.print(result);

    }
}