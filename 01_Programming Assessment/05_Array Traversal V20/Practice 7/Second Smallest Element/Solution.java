import java.util.Scanner;

class Main {

    public static long findSecondSmallest(long[] arr) {
        long smallest = Long.MAX_VALUE;
        long secondSmallest = Long.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }

        long result = findSecondSmallest(arr);
        System.out.println(result);
    }
}