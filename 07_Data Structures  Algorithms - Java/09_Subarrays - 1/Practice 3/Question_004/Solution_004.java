import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }

        printKSizeSubarraywithDiffM(arr, n, m, k);
    }

    public static void printKSizeSubarraywithDiffM(int[] arr, int n, int m, int k) {
        boolean found = false;

        for(int i=0; i<=n-k; i++) {
            int j = i+k-1;

            int maxVal = arr[i];
            int minVal = arr[i];
            for(int x=i; x<=j; x++) {
                maxVal = Math.max(maxVal, arr[x]);
                minVal = Math.min(minVal, arr[x]);
            }

            if((maxVal - minVal) == m) {
                for(int x=i; x<=j; x++) {
                    System.out.print(arr[x] + " ");
                }
                System.out.println();
                found = true;
            }
        }

        if(!found) {
            System.out.print("None");
        }
    }
}