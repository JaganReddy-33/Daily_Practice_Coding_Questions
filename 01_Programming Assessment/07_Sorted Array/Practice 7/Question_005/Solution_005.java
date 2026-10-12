import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        printCountOfEleGreaterThanOrEqualToTarget(arr, n, target);
    }

    public static void printCountOfEleGreaterThanOrEqualToTarget(int[] arr, int n, int target) {
        int count = 0;

        for(int i=0; i<n; i++) {
            if(arr[i] >= target) {
                count++;
            }
        }
        System.out.print(count);
    }
}