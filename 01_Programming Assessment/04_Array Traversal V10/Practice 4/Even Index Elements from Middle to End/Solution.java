import java.util.Scanner;

class Main {

    public static void evenIdxEle(int[] arr, int n){
        if(n<1){
            System.out.print("None");
            return;
        }

        for(int i=n/2; i<n; i++){
            if(i%2 == 0){
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];

        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }

        evenIdxEle(arr, n);
    }
}