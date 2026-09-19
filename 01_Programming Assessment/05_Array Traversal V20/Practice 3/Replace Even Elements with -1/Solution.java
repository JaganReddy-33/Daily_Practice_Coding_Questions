import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }

        replaceEvenElements(arr, n);
    }

    public static void replaceEvenElements(long[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = -1;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}