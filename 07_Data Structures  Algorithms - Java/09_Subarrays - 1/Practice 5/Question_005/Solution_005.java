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
        printKSizeProdEqualsM(arr, n, k, m);
    }

    public static void printKSizeProdEqualsM(int[] arr, int n, int k, int m) {
        boolean found = false;

        for(int i=0; i<=n-k; i++) {
            int j = i+k-1;
            long prod = 1;

            for(int x=i; x<=j; x++) {
                prod *= arr[x];
            }

            if(prod == m) {
                found = true;
                for(int p=i; p<=j; p++){
                    System.out.print(arr[p] + " ");
                }
                System.out.println();
            }
        }

        if(!found) {
            System.out.print("None");
        }
    }
}