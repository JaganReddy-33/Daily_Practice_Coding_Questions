import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt(); 
        long mVal = scanner.nextLong(); 
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        printKSizeSubarraysWithProductM(arr, n, k, mVal);
    }

    public static void printKSizeSubarraysWithProductM(int[] arr, int n, int k, long mVal) {
        boolean found = false;

        for (int i = 0; i <= n - k; i++) {
            int j = i + k - 1;
            
            long product = 1;
            for (int m = i; m <= j; m++) {
                product *= arr[m];
            }
            
            if (product == mVal) {
                found = true;
                for (int m = i; m <= j; m++) {
                    System.out.print(arr[m] + " ");
                }
                System.out.println();
            }
        }

        if (!found) {
            System.out.print("None");
        }
    }
}