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
        
        printFirstValueMultiplePairs(arr, n, k);
    }

    public static void printFirstValueMultiplePairs(int[] arr, int n, int k) {
        
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] % k == 0) {
                for (int j = i + 1; j < n; j++) {
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