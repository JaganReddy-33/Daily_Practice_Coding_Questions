import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }

        printEvenDiffSubarrays(arr, n);
    }

    public static void printEvenDiffSubarrays(int[] arr, int n) {
        boolean found = false;

        for(int len=1; len<=n; len++) {
            for(int i=0; i<=n-len; i++) {
                int j = i+len-1;

                int maxVal = arr[i];
                int minVal = arr[i];
                for(int k=i; k<=m; k++) {
                    maxVal = Math.max(maxVal, arr[k]);
                    minVal = Math.min(minVal, arr[k]);
                }

                if((maxVal - minVal)%2 == 0) {
                    found = true;
                    for(int k=i; k<=j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }
            }
        }

        if(!found) {
            System.out.print("None");
        }
    }
}