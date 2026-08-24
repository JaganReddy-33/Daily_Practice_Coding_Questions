import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean[] arr = new boolean[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextBoolean();
        }
        swapBooleans(arr);
    }

    public static void swapBooleans(boolean[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = !arr[i];
            System.out.print(arr[i] + (i == arr.length - 1 ? "" : " "));
        }
    }
}