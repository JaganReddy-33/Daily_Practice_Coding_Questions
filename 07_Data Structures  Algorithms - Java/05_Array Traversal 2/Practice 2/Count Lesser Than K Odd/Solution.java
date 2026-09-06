import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        System.out.println(countLesserOdd(arr, k));
    }

    public static int countLesserOdd(int[] arr, int k) {
        int count = 0;
        for (int val : arr) {
            if (val < k && val % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}