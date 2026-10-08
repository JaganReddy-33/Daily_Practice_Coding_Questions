import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        printUniqueOddIndexElements(arr, n);
    }

    public static void printUniqueOddIndexElements(int[] arr, int n) {
        boolean found = false;

        for (int i = 1; i < n; i += 2) {
            
            boolean leftDiff = (i == 0) || (arr[i] != arr[i - 1]);
            boolean rightDiff = (i == n - 1) || (arr[i] != arr[i + 1]);

            if (leftDiff && rightDiff) {
                System.out.print(arr[i] + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.print("-1");
        }
    }
}