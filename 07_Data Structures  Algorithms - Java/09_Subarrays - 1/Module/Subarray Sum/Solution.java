import java.util.Scanner;

public class Main {
    static void subarrayOfSize(int[] arr, int k) {
        boolean found = false;

        for (int len = 1; len <= arr.length; len++) {
            for (int i = 0; i <= arr.length - len; i++) {
                int j = i + len - 1;
                
                int sum = 0;
                for (int m = i; m <= j; m++) {
                    sum += arr[m];
                }

                if (sum == k) {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();

        subarrayOfSize(arr, k);
    }
}