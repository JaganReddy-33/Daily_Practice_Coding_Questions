import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();       
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        printSmallestOddProductSubarray(arr, n);
    }

    public static void printSmallestOddProductSubarray(int[] arr, int n) {
        int minLen = Integer.MAX_VALUE;
        int start = -1;
        int end = -1;

        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                
                long product = 1;
                for (int m = i; m <= j; m++) {
                    product *= arr[m];
                }
                
                if (Math.abs(product) % 2 != 0) {
                    int currLen = j - i + 1;
                    if (currLen < minLen) {
                        minLen = currLen;
                        start = i;
                        end = j;
                    }
                }
            }
            if (minLen != Integer.MAX_VALUE) {
                break;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            System.out.print("None");
        } else {
            for (int k = start; k <= end; k++) {
                System.out.print(arr[k] + " ");
            }
        }
    }
}