import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        printRepeatedEvenElements(arr, n);
    }

    public static void printRepeatedEvenElements(int[] arr, int n) {
        boolean foundRepeatedEven = false;
        int count = 1;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                if (count > 1 && arr[i] % 2 == 0) {
                    System.out.print(arr[i] + " ");
                    foundRepeatedEven = true;
                }
                count = 1;
            }
        }

        if (count > 1 && arr[n - 1] % 2 == 0) {
            System.out.print(arr[n - 1] + " ");
            foundRepeatedEven = true;
        }

        if (!foundRepeatedEven) {
            System.out.print("None");
        }
    }
}