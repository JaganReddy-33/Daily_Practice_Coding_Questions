import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int mVal = scanner.nextInt(); 
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        printKSizeSubarraysWithDiffM(arr, n, k, mVal);
    }

    public static void printKSizeSubarraysWithDiffM(int[] arr, int n, int k, int mVal) {
        boolean found = false;

        for (int i = 0; i <= n - k; i++) {
            int j = i + k - 1;
            
            int minVal = arr[i];
            int maxVal = arr[i];
            for (int x = i; x <= j; x++) {
                minVal = Math.min(minVal, arr[x]);
                maxVal = Math.max(maxVal, arr[x]);
            }
            
            if ((maxVal - minVal) == mVal) {
                found = true;
                for (int x = i; x <= j; x++) {
                    System.out.print(arr[x] + (x == j ? "" : " "));
                }
                System.out.println();
            }
        }

        if (!found) {
            System.out.print("None");
        }
    }
}