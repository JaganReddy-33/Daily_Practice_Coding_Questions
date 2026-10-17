import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        printLongestEvenSumSubarray(arr, n);
    }

    public static void printLongestEvenSumSubarray(int[] arr, int n) {
        int maxLength = 0;
        int start = -1;
        int end = -1;

        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += arr[j];
                if (currentSum % 2 == 0) {
                    int currentLength = j - i + 1;
                    if (currentLength > maxLength) {
                        maxLength = currentLength;
                        start = i;
                        end = j;
                    }
                }
            }
        }

        if (maxLength == 0) {
            System.out.print("None");
        } else {
            for (int k = start; k <= end; k++) {
                System.out.print(arr[k] + " ");
            }
        }
    }
}