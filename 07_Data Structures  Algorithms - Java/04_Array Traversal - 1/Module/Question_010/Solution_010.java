import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
       
       calculateProduct(arr);
       
    }

    public static int calculateProduct(int[] arr) {
        int product = 1;
        for(int i=0; i<arr.length; i++){
            product *= arr[i];
        }
        return product;
    }
}