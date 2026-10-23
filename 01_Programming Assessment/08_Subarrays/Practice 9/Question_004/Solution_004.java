import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();    
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        printMultiplesOfKSubarrays(arr, n, k);
    }

    public static void printMultiplesOfKSubarrays(int[] arr, int n, int k) {
        boolean found = false;

        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                
                boolean allMultiples = true;
                for (int m = i; m <= j; m++) {
                    if (arr[m] % k != 0) {
                        allMultiples = false;
                        break;
                    }
                }
                
                if (allMultiples) {
                    found = true;
                    for (int m = i; m <= j; m++) {
                        System.out.print(arr[m] + " ");
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