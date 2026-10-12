import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] =scanner.nextInt();
        }
        int k = scanner.nextInt();

        printKLargestEle(arr, n, k);
    }

    public static void printKLargestEle(int[] arr, int n, int k) {
        for(int i=n-k; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}