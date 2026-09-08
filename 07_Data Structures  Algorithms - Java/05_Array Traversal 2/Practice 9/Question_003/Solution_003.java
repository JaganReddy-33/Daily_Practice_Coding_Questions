import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(findLargestPositive(arr, n));
    }

    public static int findLargestPositive(int[] arr, int n) {
        int maxPositive = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 && arr[i] > maxPositive) {
                maxPositive = arr[i];
            }
        }
        return maxPositive;
    }
}