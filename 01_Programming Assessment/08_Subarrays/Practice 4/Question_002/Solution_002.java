import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();       
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        printLongestEvenDiffSubarray(arr, n);
    }

    public static void printLongestEvenDiffSubarray(int[] arr, int n) {
        int maxLength = 0;
        int start = -1;
        int end = -1;

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                
                int minVal = arr[i];
                int maxVal = arr[i];
                for (int m = i; m <= j; m++) {
                    minVal = Math.min(minVal, arr[m]);
                    maxVal = Math.max(maxVal, arr[m]);
                }
              
                if ((maxVal - minVal) % 2 == 0) {
                    int currentLength = j - i + 1;
                    if (currentLength >= maxLength) {
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