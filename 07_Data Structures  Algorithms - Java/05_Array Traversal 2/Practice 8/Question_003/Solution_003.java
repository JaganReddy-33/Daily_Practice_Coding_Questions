import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(countSmallestOccurrence(arr, n));
    }

    public static int countSmallestOccurrence(int[] arr, int n) {
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == min) {
                count++;
            }
        }
        return count;
    }
}