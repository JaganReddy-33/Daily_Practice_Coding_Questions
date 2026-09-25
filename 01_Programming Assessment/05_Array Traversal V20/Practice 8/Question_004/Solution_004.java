import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        occurenceOfLargestEle(arr, n);
    }

    public static void occurenceOfLargestEle(int[] arr, int n){
        long max = Long.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        int count = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == max ){
                count++;
            }
        }
        System.out.print(count);
    }
}