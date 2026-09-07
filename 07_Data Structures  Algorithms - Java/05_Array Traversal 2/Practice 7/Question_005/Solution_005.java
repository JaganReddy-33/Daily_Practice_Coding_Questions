import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }
        System.out.print(getDistanceBetweenLargest(arr, n));
    }

    public static int getDistanceBetweenLargest(long[] arr, int n) {
        int max1Idx = -1;
        int max2Idx = -1;

        for (int i = 0; i < n; i++) {
            if (max1Idx == -1 || arr[i] > arr[max1Idx]) {
                max2Idx = max1Idx;
                max1Idx = i;
            } else if (max2Idx == -1 || arr[i] > arr[max2Idx]) {
                max2Idx = i;
            }
        }

        return Math.abs(max1Idx - max2Idx);
    }
}