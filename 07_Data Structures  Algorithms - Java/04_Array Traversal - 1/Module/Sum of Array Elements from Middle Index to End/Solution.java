import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        int res = calculateSum(arr);
        System.out.print(res);
        
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for(int i=arr.length/2; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
}