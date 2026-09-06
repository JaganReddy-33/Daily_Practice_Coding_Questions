import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        separateEvenOdd(arr);
    }

    public static void separateEvenOdd(int[] arr) {
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        for (int val : arr) {
            if (val % 2 == 0) {
                even.append(val).append(" ");
            } else {
                odd.append(val).append(" ");
            }
        }
        System.out.println(even.toString().trim());
        System.out.println(odd.toString().trim());
    }
}