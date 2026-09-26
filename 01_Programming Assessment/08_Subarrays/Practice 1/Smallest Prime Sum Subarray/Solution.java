import java.util.Scanner;

class Main {
    public static void findSmallestPrimeSumSubarray(int[] arr, int n) {
        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int sum = 0;
                for (int j = i; j < i + len; j++) {
                    sum += arr[j];
                }
                
                if (isPrime(sum)) {
                    for (int j = i; j < i + len; j++) {
                        System.out.print(arr[j]+" ");
                    }
                    return;
                }
            }
        }
        System.out.println("None");
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        findSmallestPrimeSumSubarray(arr, n);
    }
}