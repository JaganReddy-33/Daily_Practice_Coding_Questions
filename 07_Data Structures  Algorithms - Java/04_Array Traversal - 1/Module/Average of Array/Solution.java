import java.util.Scanner;
public class Main {

    public static void printAvg(int[] arr, int n){
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        double avg = sum / n;
        System.out.printf("%.2f\n", avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }

        printAvg(arr, N);
    }
}