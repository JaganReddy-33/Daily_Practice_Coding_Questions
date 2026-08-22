import java.util.Scanner;

class Main {
    public static void printEvenIndexToMiddle(int[] arr) {
        int mid = arr.length / 2;
        boolean found = false;
        for (int i = 0; i <= mid; i += 2) {
            System.out.print(arr[i]+" ");
            found = true;
        }
        if (!found) {
            System.out.print("None");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            printEvenIndexToMiddle(arr);
        }
    }
}