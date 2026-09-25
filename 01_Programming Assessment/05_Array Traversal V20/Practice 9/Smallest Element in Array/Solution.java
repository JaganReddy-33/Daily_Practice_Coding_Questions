import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        smallestEle(arr, n);
    }

    public static void smallestEle(int[] arr, int n){
        int min = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.print(min);
    }
}