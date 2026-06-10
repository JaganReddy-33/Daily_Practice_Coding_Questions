import java.util.Scanner;
public class Main {

    public static int sumDivisibleEle(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%3 == 0 && arr[i]%5 == 0){
                sum += arr[i];
            }
    }
    return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        int res = sumDivisibleEle(arr);
        System.out.print(res);
    }
}