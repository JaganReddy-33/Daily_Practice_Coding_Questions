import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
         
        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (isPrime(arr[i])) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }

    public static boolean isPrime(long num) {
        if (num <= 1) return false;
        for (long i = 2; i * i <= num; i ++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}