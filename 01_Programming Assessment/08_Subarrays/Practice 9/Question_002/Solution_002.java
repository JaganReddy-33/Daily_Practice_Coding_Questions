import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();     
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        printEvenNumbersSubarrays(arr, n);
    }

    public static void printEvenNumbersSubarrays(int[] arr, int n) {
        boolean found = false;

        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                
                boolean allEven = true;
                for (int m = i; m <= j; m++) {
                    if (arr[m] % 2 != 0) {
                        allEven = false;
                        break;
                    }
                }
                
                if (allEven) {
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