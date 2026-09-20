import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr =new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }

        findLargestEleDivisible(arr, n, k);
    }

    public static void findLargestEleDivisible(int[] arr, int n, int k){
        long max = Long.MIN_VALUE;
        
        for(int i=0; i<n; i++){
            if(arr[i] % k == 0){
                if(arr[i] > max){
                    max = arr[i];
                }
            }
        }

        if(max == Long.MIN_VALUE){
            System.out.print(-1);
        } else {
            System.out.print(max);
        }
    }
}