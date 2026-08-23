import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }
        printProductOfOddIndices(arr, n);
    }

    public static void printProductOfOddIndices(long[] arr, int n) {
        int mid = n / 2;
        boolean found = false;
        long product = 1;
        for (int i = 1; i <= mid; i += 2) {
            product *= arr[i];
            found = true;
        }
        if (found) {
            System.out.println(product);
        } else {
            System.out.println("None");
        }
    }
}