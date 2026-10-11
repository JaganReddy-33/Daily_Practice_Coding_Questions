import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        printSumOfUniqueEle(arr, n);
    }

    public static void printSumOfUniqueEle(int[] arr, int n){
        long sum = 0;

        for(int i=0; i<n; i++){
            boolean isLeftDiffrent = (i == 0) || (arr[i] != arr[i-1]);
            boolean isRightDiffrent = (i == n-1) || (arr[i] != arr[i+1]);

            if(isLeftDiffrent && isRightDiffrent){
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}