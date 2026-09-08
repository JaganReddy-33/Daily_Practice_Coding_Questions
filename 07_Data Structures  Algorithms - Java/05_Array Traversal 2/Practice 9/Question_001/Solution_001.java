import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(findSmallestPositive(arr, n));
    }

    public static int findSmallestPositive(int[] arr, int n) {
        int minPositive = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 && arr[i] < minPositive) {
                minPositive = arr[i];
            }
        }
        return minPositive == Integer.MAX_VALUE ? -1 : minPositive;
    }
}