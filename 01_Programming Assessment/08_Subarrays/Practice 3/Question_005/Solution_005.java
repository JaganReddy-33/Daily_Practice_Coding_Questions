import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();     
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        printLongestPrimeDiffSubarray(arr, n);
    }

    public static void printLongestPrimeDiffSubarray(int[] arr, int n) {
        int maxLength = 0;
        int bestStart = -1;
        int bestEnd = -1;

        for (int i = 0; i < n; i++) {
            int minVal = arr[i];
            int maxVal = arr[i];
            
            for (int j = i; j < n; j++) {
                minVal = Math.min(minVal, arr[j]);
                maxVal = Math.max(maxVal, arr[j]);
                
                int diff = maxVal - minVal;
  
                if (isPrime(diff)) {
                    int currentLength = j - i + 1;
                    if (currentLength > maxLength) {
                        maxLength = currentLength;
                        bestStart = i;
                        bestEnd = j;
                    }
                }
            }
        }

        if (maxLength == 0) {
            System.out.print("None");
        } else {
            for (int k = bestStart; k <= bestEnd; k++) {
                System.out.print(arr[k] + (k == bestEnd ? "" : " "));
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}