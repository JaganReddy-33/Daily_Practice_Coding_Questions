import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        
        long primeSum = 0;
        long primeCount = 0;
        
        for (int i = 0; i < n; i++) {
            if (isPrime(arr[i])) {
                primeSum += arr[i];
                primeCount++;
            }
        }
        System.out.println(primeSum - primeCount);
    }

    public static boolean isPrime(long num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}