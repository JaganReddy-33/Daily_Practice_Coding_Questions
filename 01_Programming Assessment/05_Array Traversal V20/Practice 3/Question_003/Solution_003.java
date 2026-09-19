import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        replaceOddEle(arr, n);
    }

    public static void replaceOddEle(int[] arr, int n){
        for(int i=0; i<n; i++){
            if(arr[i]%2 != 0){
                arr[i] = -1;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}