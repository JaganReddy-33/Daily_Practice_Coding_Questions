import java.util.Scanner;

class Main {
    public static void reverseArrayEle(int[] arr, int n){
        int left=0; 
        int right=n-1;
        while(left < right){
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        reverseArrayEle(arr, n);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}