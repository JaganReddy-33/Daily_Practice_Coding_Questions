import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(findSmallestNegative(arr, n));
    }

    public static int findSmallestNegative(int[] arr, int n) {
        int minNegative = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0 && arr[i] < minNegative) {
                minNegative = arr[i];
            }
        }
        return minNegative == Integer.MAX_VALUE ? 0 : minNegative;
    }
}