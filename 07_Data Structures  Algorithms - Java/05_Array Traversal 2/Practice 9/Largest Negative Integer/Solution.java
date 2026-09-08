import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(findLargestNegative(arr, n));
    }

    public static int findLargestNegative(int[] arr, int n) {
        int maxNegative = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0 && arr[i] > maxNegative) {
                maxNegative = arr[i];
            }
        }
        return maxNegative == Integer.MIN_VALUE ? 0 : maxNegative;
    }
}