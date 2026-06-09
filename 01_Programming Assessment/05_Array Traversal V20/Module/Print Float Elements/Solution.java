import java.util.Scanner;

public class Main {
    public static void printFloatElements(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        float[] arr = new float[n];
        
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextFloat();
        }

        printFloatElements(arr);
    }
}
