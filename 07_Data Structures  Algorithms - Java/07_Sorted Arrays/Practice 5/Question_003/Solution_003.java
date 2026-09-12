import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        printDistinctElements(arr);
    }

    static void printDistinctElements(int[] arr) {
        if (arr.length == 0) return;
        
        System.out.print(arr[0] + " ");
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}