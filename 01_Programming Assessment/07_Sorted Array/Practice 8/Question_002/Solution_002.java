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

        printLargestEleSmallerThanTarget(arr, n, target);
    }

    public static void printLargestEleSmallerThanTarget(int[] arr, int n, int target) {
        Integer result = null;

        for(int i=0; i<n; i++){
            if(arr[i] < target){
                result = arr[i];
            } else {
                break;
            }
        }

        if(result == null){
            System.out.print("None");
        } else {
            System.out.print(result);
        }
    }
}