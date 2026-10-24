import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long k = scanner.nextInt();
        int m = scanner.nextInt();      
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        printAllKProductSubarrays(arr, n, k, m);
    }

    public static void printAllKProductSubarrays(int[] arr, int n, long k, int m) {
        boolean found = false;

        for (int len = m + 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                
                long product = 1;
                for (int x = i; x <= j; x++) {
                    product *= arr[x];
                }
                
                if (product == k) {
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