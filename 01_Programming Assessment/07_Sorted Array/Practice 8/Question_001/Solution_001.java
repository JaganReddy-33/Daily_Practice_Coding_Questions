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

        printSmallestGreaterThanTarget(arr, n, target);
    }

    public static void printSmallestGreaterThanTarget(int[] arr, int n, int target) {
        int res = -1;

        for(int i=0; i<n; i++){
            if(arr[i] > target){
                res = arr[i];
                break;
            }
        }

        System.out.print(res);
    }
}