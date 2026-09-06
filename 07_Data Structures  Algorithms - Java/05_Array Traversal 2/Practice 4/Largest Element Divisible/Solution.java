import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        findLargestDivisible(arr, k);
    }

    public static void findLargestDivisible(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                found = true;
            }
        }
        if (found) {
            System.out.println(max);
        } else {
            System.out.println(-1);
        }
    }
}