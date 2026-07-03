import java.util.Scanner;

class Main {

    public static void sumOfOddIdx(int[] arr, int n){
        long sum=0;
        for(int i=0; i<n; i++){
            if(i%2 != 0){
                sum+=arr[i];
            }
        }
        System.out.print(sum);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }

        sumOfOddIdx(arr, n);
    }
}