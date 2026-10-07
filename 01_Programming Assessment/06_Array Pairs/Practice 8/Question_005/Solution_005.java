import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        findPairsWithNegativeFirst(arr, n);
    }

    public static void findPairsWithNegativeFirst(int[] arr, int n) {
        
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                for (int j = 0; j < n; j++) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}