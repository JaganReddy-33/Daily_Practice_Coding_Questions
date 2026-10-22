import java.util.Scanner;
import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();       
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        printDistinctElementsSubarrays(arr, n);
    }

    public static void printDistinctElementsSubarrays(int[] arr, int n) {
        boolean found = false;

        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                
                HashSet<Integer> set = new HashSet<>();
                boolean allDistinct = true;
                
                for (int m = i; m <= j; m++) {
                    if (!set.add(arr[m])) {
                        allDistinct = false;
                        break;
                    }
                }
                
                if (allDistinct) {
                    found = true;
                    for (int m = i; m <= j; m++) {
                        System.out.print(arr[m] + " ");
                    }
                    System.out.println();
                }
            }
        }

        if (!found) {
            System.out.print("None");
        }
    }
}