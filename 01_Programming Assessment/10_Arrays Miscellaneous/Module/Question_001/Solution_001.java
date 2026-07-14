import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int slow = n - 1;
        for (int fast = n - 1; fast >= 0; fast--) {
            if (arr[fast] != -1) {
                arr[slow] = arr[fast];
                slow--;
            }
        }

        while (slow >= 0) {
            arr[slow] = -1;
            slow--;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}