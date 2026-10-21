import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();       
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        printAlternatingSignSubarrays(arr, n);
    }

    public static void printAlternatingSignSubarrays(int[] arr, int n) {
        boolean found = false;

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                
                boolean isAlternating = true;
                for (int m = i; m < j; m++) {
                    if ((long) arr[m] * arr[m + 1] >= 0) {
                        isAlternating = false;
                        break;
                    }
                }
                
                if (isAlternating) {
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