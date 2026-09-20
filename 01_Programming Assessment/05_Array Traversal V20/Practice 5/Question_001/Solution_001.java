import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        printSecondSmallestEven(arr, n);
    }

    public static void printSecondSmallestEven(int[] arr, int n) {
        long min = Long.MAX_VALUE;
        long secondMin = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                if (arr[i] < min) {
                    secondMin = min;
                    min = arr[i];
                } else if (arr[i] < secondMin && arr[i] != min) {
                    secondMin = arr[i];
                }
            }
        }

        if (secondMin == Long.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(secondMin);
        }
    }
}