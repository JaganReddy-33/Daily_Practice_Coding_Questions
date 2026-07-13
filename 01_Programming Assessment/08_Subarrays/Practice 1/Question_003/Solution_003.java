import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        
        boolean found = false;
        for (int i = 0; i <= N - K; i++) {
            int currentSum = 0;
            for (int j = i; j < i + K; j++) {
                currentSum += arr[j];
            }
            if (currentSum == M) {
                found = true;
                for (int j = i; j < i + K; j++) {
                    System.out.print(arr[j] + (j == i + K - 1 ? "" : " "));
                }
                System.out.println();
            }
        }
        if (!found) {
            System.out.println("None");
        }
    }
}