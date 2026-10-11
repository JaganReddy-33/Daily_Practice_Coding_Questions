import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        printCountOfUniqueEle(arr, n);
    }

    public static void printCountOfUniqueEle(int[] arr, int n){
        int count  = 0;

        for(int i=0; i<n; i++){
            boolean isLeftDiff = (i == 0) || (arr[i] != arr[i-1]);
            boolean isRightDiff = (i == n-1) || (arr[i] != arr[i+1]);

            if(isLeftDiff && isRightDiff){
                count++;
            }
        }
        System.out.println(count);
    }
}