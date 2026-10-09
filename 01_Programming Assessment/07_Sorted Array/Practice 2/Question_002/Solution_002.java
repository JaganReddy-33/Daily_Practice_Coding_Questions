import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        printRepeatedElementOccurrences(arr, n);
    }

    public static void printRepeatedElementOccurrences(int[] arr, int n) {
        boolean foundRepeated = false;
        int count = 1;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                if (count > 1) {
                    System.out.println(arr[i] + " - " + count);
                    foundRepeated = true;
                }
                count = 1;
            }
        }

        if (count > 1) {
            System.out.println(arr[n - 1] + " - " + count);
            foundRepeated = true;
        }

        if (!foundRepeated) {
            System.out.println("-1");
        }
    }
}