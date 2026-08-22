import java.util.Scanner;

class Main {
    public static void printOddIndexFromMiddleToEnd(int[] arr) {
        int mid = arr.length / 2;
        int start = (mid % 2 != 0) ? mid : mid + 1;
        boolean found = false;
        for (int i = start; i < arr.length; i += 2) {
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
            printOddIndexFromMiddleToEnd(arr);
        }
    }
}