import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        findPairsWithFirstValueAsFactor(arr, n);
    }

    public static void findPairsWithFirstValueAsFactor(int[] arr, int n) {
        boolean found = false;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == 0) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (arr[j] % arr[i] == 0) {
                    System.out.println(arr[i] + " " + arr[j]);
                    found = true;
                }
            }
        }
        
        if (!found) {
            System.out.println("No pairs found");
        }
    }
}