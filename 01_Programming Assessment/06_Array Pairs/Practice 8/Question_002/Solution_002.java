import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        findPairsWithEvenSecond(arr, n);
    }

    public static void findPairsWithEvenSecond(int[] arr, int n) {
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] % 2 == 0) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}