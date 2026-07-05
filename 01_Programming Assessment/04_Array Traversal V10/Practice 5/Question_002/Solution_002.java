import java.util.Scanner;

class Main {

    public static void productOfOddIdx(int[] arr, int n){
        if(n<=1){
            System.out.print("None");
            return;
        }
        int prod = 1;
        for(int i=0; i<=n/2; i++){
            if(i%2 != 0){
                prod *= arr[i];
            }
        }
        System.out.print(prod);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }

        productOfOddIdx(arr, n);
    }
}