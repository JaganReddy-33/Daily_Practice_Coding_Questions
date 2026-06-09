import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        int res = calculateProduct(arr);
        System.out.print(res);
       
    }

    public static int calculateProduct(int[] arr) {
       int mul = 1;
       for(int i=0; i<arr.length/2; i++){
        mul *= arr[i];
       }
       return mul;
    }
}