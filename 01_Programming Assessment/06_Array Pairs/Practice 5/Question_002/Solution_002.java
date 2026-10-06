import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        findPairsWithOddSum(arr, n);
    }

    public static void findPairsWithOddSum(int[] arr, int n) {
        boolean found = false;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(arr[i] + arr[j]) % 2 != 0) {
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