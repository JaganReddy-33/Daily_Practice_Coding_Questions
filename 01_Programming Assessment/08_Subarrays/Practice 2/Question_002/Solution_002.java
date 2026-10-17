import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        printSmallestEvenSumSubarray(arr, n);
    }

    public static void printSmallestEvenSumSubarray(int[] arr, int n) {
        int minLen = Integer.MAX_VALUE;
        int start = -1;
        int end = -1;

        for (int i = 0; i < n; i++) {
            int currSum = 0;
            for (int j = i; j < n; j++) {
                currSum += arr[j];
                if (currSum % 2 == 0) {
                    int currentLen = j - i + 1;
                    if (currentLen < minLen) {
                        minLen = currentLen;
                        start = i;
                        end = j;
                    }
                }
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