import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }

        printMatchingSumSubarrays(arr, n, m, k);
    }

    public static void printMatchingSumSubarrays(int[] arr, int n, int m, int k) {
        boolean found = false;

        for(int i=0; i<=n-k; i++) {
            int j = i+k-1;
            int sum = 0;
            for(int x=i; x<=j; x++) {
                sum += arr[x];
            }

            if(sum == m) {
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