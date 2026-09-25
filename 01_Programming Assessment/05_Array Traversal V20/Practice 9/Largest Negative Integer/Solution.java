import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }


        largestNegativeInteger(arr, n);
    }

    public static void largestNegativeInteger(int[] arr, int n){
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i]>0 && arr[i]>max){
                max = arr[i];
            }
        }

        if(max == Integer.MIN_VALUE){
            System.out.print(-1);
        } else {
            System.out.print(max);
        }
    }
}