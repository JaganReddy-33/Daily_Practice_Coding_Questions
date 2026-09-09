import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        printPairsFirstGreaterThanK(arr, k);
    }

    public static void printPairsFirstGreaterThanK(int[] arr, int k) {
        boolean found = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > k) {
                for (int j = i + 1; j < arr.length; j++) {
                    System.out.println(arr[i] + " " + arr[j]);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("None");
        }
    }
}