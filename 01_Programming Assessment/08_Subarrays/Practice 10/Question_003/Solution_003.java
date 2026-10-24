import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int m = scanner.nextInt();       
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        printAllKSumSubarrays(arr, n, k, m);
    }

    public static void printAllKSumSubarrays(int[] arr, int n, int k, int m) {
        boolean found = false;

        for (int len = m + 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                
                long sum = 0;
                for (int x = i; x <= j; x++) {
                    sum += arr[x];
                }
                
                if (sum == k) {
                    found = true;
                    for (int x = i; x <= j; x++) {
                        System.out.print(arr[x] + " ");
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