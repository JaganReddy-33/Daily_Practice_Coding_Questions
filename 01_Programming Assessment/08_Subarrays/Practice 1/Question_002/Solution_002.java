import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        boolean found = false;
        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int sum = 0;
                for (int j = i; j < i + len; j++) {
                    sum += arr[j];
                }
                if (Math.abs(sum) % 2 != 0) {
                    found = true;
                    for (int j = i; j < i + len; j++) {
                        System.out.print(arr[j] + " ");
                    }
                    System.out.println();
                }
            }
        }
        if (!found) {
            System.out.println("None");
        }
    }
}