import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        findPositiveNegativePairs(arr, n);
    }

    public static void findPositiveNegativePairs(int[] arr, int n) {
        boolean found = false;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n - 1; i++) {
            if (visited[i] || arr[i] == 0) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (!visited[j] && arr[i] + arr[j] == 0) {
                    System.out.println(arr[i] + " " + arr[j]);
                    visited[i] = true;
                    visited[j] = true;
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("No pairs found");
        }
    }
}