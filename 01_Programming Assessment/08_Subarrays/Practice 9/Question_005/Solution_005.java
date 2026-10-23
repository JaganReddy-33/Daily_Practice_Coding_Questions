import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        printSubarrayProducts(arr, n, m);
    }

    public static void printSubarrayProducts(int[] arr, int n, int m) {
        boolean found = false;

        for (int len = m + 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                
                long product = 1;
                for (int k = i; k <= j; k++) {
                    product *= arr[k];
                }
                
                found = true;
                System.out.println(product);
            }
        }

        if (!found) {
            System.out.print("None");
        }
    }
}