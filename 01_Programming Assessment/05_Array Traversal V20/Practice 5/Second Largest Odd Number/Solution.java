import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }

        findSecondLargestOddNum(arr, n);
    }

    public static void findSecondLargestOddNum(int[] arr, int n){
        long max = Long.MIN_VALUE;
        long secongMax = Long.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i]%2 != 0){
                if(arr[i] > max){
                    secongMax = max;
                    max = arr[i];
                } else if(arr[i] > secongMax && arr[i]!=max){
                    secongMax = arr[i];
                }
            }
        }
        if(secongMax == Long.MIN_VALUE){
            System.out.print(-1);
        } else {
            System.out.print(secongMax);
        }
    }
}