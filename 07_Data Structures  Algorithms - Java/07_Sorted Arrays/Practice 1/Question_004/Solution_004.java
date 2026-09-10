import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        printUniqueOddIndexElements(arr, n);
    }

    public static void printUniqueOddIndexElements(int[] arr, int n) {
        boolean found = false;
        for (int i = 1; i < n; i += 2) {
            if ((i == 1 || arr[i] != arr[i - 2]) && (i + 2 >= n || arr[i] != arr[i + 2])) {
                if (found) {
                    System.out.print(" ");
                }
                System.out.print(arr[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.print("-1");
        }
    }
}