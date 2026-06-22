import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        float[] arr = new float[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextFloat();
        }

        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }

    }
}
