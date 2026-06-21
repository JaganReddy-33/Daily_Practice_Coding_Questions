import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        int res = calculateProduct(arr);
        System.out.print(res);
        
    }

    public static int calculateProduct(int[] arr) {
       int product = 1;
       for(int i=arr.length/2; i<arr.length; i++){
        product *= arr[i];
       }
       return product;
    }
}