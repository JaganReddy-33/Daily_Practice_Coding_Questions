import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        long product = 1;
        for (int num : arr) {
            if (num % 2 == 0) {
                product *= num;
            }
        }
        System.out.print(product);
    }
}