import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        printEvenUniqueElements(arr, n);
    }

    public static void printEvenUniqueElements(int[] arr, int n) {
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                if ((i == 0 || arr[i] != arr[i - 1]) && (i == n - 1 || arr[i] != arr[i + 1])) {
                    if (found) {
                        System.out.print(" ");
                    }
                    System.out.print(arr[i]);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.print("-1");
        }
    }
}