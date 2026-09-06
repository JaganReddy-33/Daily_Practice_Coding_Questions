import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        findSecondSmallestOdd(arr);
    }

    public static void findSecondSmallestOdd(int[] arr) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                if (arr[i] < min) {
                    secondMin = min;
                    min = arr[i];
                } else if (arr[i] < secondMin && arr[i] != min) {
                    secondMin = arr[i];
                }
            }
        }
        if (secondMin != Integer.MAX_VALUE) {
            System.out.println(secondMin);
        } else {
            System.out.println(-1);
        }
    }
}