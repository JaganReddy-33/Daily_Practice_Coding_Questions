import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        long product = 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                product *= arr[i];
            }
        }
        System.out.print(product);
    }
}