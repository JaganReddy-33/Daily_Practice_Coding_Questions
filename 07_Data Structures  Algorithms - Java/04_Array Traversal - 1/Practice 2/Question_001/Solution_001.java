import java.util.Scanner;

class Main {
    static void printOddElements(int[] arr) {
        boolean found = false;
        for (int val : arr) {
            if (val % 2 != 0) {
                System.out.print(val + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("None");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        printOddElements(arr);
    }
}