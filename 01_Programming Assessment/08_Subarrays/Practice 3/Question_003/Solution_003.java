import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        printSubarraysOddDiff(arr, n);
    }

    public static void printSubarraysOddDiff(int[] arr, int n) {
        boolean found = false;

        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                
                int minVal = arr[i];
                int maxVal = arr[i];
                for (int m = i; m <= j; m++) {
                    minVal = Math.min(minVal, arr[m]);
                    maxVal = Math.max(maxVal, arr[m]);
                }
                
                if ((maxVal - minVal) % 2 != 0) {
                    found = true;
                    for (int m = i; m <= j; m++) {
                        System.out.print(arr[m] + (m == j ? "" : " "));
                    }
                    System.out.println();
                }
            }
        }

        if (!found) {
            System.out.print("None");
        }
    }
}