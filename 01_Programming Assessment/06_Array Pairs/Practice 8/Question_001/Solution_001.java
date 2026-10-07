import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        findPairsWithOddFirst(arr, n);
    }

    public static void findPairsWithOddFirst(int[] arr, int n) {
        boolean found = false;
        
        for (int i = 0; i < n; i++) {
            if (Math.abs(arr[i]) % 2 != 0) {
                for (int j = 0; j < n; j++) {
                    if (i != j) {
                        System.out.println(arr[i] + " " + arr[j]);
                        found = true;
                    }
                }
            }
        }
        if (!found) {
            System.out.println("None");
        }
    }
}