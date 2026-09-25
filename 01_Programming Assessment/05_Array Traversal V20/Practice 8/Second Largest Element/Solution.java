import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        secondLargestEle(arr, n);
    }

    public static void secondLargestEle(int[] arr, int n){
        long max = Long.MIN_VALUE;
        long secMax = Long.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i] > max){
                secMax = max;
                max = arr[i];
            } else if(arr[i] > secMax){
                secMax = arr[i];
            }
        }
        System.out.print(secMax);
    }
}