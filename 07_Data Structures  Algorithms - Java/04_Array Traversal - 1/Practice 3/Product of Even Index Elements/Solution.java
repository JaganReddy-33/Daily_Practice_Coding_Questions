import java.util.Scanner;

class Main {
    public static long productOfEvenIndexElements(int[] arr) {
        long product = 1;
        for (int i = 0; i < arr.length; i += 2) {
            product *= arr[i];
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(productOfEvenIndexElements(arr));
    }
}