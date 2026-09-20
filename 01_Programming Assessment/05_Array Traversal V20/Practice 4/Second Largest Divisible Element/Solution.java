import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int k =scanner.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }

        findSecondLargestDivisible(arr, n, k);
    }

    public static void findSecondLargestDivisible(int[] arr, int n, int k){

        long max = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i]%k == 0){
                if(arr[i] > max){
                    secondMax = max;
                    max = arr[i];
                } else if( arr[i] > secondMax && arr[i] != max){
                    secondMax = arr[i]; 
                }
            }
        }
        if(secondMax == Long.MIN_VALUE){
            System.out.print(-1);
        } else {
            System.out.print(secondMax);
        }
    }
}