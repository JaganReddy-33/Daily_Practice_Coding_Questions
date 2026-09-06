import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        replaceDivisibleElements(arr, k);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void replaceDivisibleElements(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0) {
                if(arr[i] < )
            }
        }
    }
}