import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        findLongestPrimeSumSubarray(arr, n);
    }
    
    public static void findLongestPrimeSumSubarray(int[] arr, int n) {
        for (int len = n; len >= 1; len--) {
            for (int i = 0; i <= n - len; i++) {
                int currentSum = 0;
                for (int j = i; j < i + len; j++) {
                    currentSum += arr[j];
                }
                
                if (isPrime(currentSum)) {
                    for(int j=i; j<i+len; j++){
                        System.out.print(arr[j]+" ");
                    }
                    return;
                }
            }
        }
        System.out.println("None");
    }
    
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}