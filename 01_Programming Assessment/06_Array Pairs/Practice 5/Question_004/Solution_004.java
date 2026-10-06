import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        findPairsWithSecondAsMultipleOfK(arr, n, k);
    }

    public static void findPairsWithSecondAsMultipleOfK(int[] arr, int n, int k) {
        boolean found = false;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (k != 0 && arr[j] % k == 0) {
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