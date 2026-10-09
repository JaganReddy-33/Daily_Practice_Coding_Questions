import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        printLastUniqueElement(arr, n);
    }

    public static void printLastUniqueElement(int[] arr, int n) {
        
        for (int i = n - 1; i >= 0; i--) {
            boolean isLeftDifferent = (i == 0) || (arr[i] != arr[i - 1]);
            boolean isRightDifferent = (i == n - 1) || (arr[i] != arr[i + 1]);

            if (isLeftDifferent && isRightDifferent) {
                System.out.println(arr[i]);
                return;
            }
        }

        System.out.println("-1");
    }
}