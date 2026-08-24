import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float[] arr = new float[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextFloat();
        }
        float product = 1.0f;
        for (int i = 0; i < n; i++) {
            product *= arr[i];
        }
        System.out.printf("%.2f", product);
    }
}