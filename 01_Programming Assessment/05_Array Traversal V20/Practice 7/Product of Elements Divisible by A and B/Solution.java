import java.util.Scanner;

class Main {

    public static long findProductOfDivisibleElements(long[] arr, long a, long b) {
        long product = 1;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % a == 0 && arr[i] % b == 0) {
                product *= arr[i];
                found = true;
            }
        }

        return product;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }
        long a = scanner.nextLong();
        long b = scanner.nextLong();

        long result = findProductOfDivisibleElements(arr, a, b);
        System.out.println(result);
    }
}