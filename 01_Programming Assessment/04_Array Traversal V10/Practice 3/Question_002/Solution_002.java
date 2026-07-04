import java.util.Scanner;

class Main {

    public static void productOfEvenIdx(int[] arr, int n){
        int prod = 1;
        if(n<=1){
            System.out.print(0);
            return;
        }

        for(int i=0; i<n; i++){
            if(i%2 == 0){
                prod *= arr[i];
            }
        }
        System.out.print(prod);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }

        productOfEvenIdx(arr, n);
    }
}