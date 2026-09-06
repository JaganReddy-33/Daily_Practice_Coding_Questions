import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        findSmallestOdd(arr);
    }

    public static void findSmallestOdd(int[] arr) {
        int min = Integer.MAX_VALUE;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                if (arr[i] < min) {
                    min = arr[i];
                }
                found = true;
            }
        }
        if (found) {
            System.out.println(min);
        } else {
            System.out.println(-1);
        }
    }
}