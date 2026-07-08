import java.util.Scanner;

public class Main {

    static void primeSubarray(int[] arr, int n) {

        boolean found = false;
        for (int len = 1; len <= n; len++) {
            for (int start = 0; start <= n - len; start++) {
                int sum = 0;
                int end = start + len - 1;
                for (int i = start; i <= end; i++) {
                    sum += arr[i];
                }
                
                if (isPrime(sum)) {
                    found = true;
                    for (int i = start; i <= end; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                }
            }
        }

        if (!found) {
            System.out.print("None");
        }
    }

    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i=2; i*i<=num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        evenSubarray(arr, N);
    }
}