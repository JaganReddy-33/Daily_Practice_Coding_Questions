import java.util.Scanner;

class Main {

    public static int findDistanceBetweenLargestAndSecondLargest(long[] arr) {
        // If array has 1 or 0 elements, distance is 0
        if (arr.length <= 1) {
            return 0;
        }
        long largest = Long.MIN_VALUE;
        long secondLargest = Long.MIN_VALUE;
        int largestIndex = 0;
        int secondLargestIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                secondLargestIndex = largestIndex;
                largest = arr[i];
                largestIndex = i;
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
                secondLargestIndex = i;
            }
        }
        return Math.abs(largestIndex - secondLargestIndex);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }

        int result = findDistanceBetweenLargestAndSecondLargest(arr);
        System.out.println(result);
    }
}