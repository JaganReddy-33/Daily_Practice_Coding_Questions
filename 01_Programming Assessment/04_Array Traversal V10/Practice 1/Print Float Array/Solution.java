import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Your code here
        int n =scanner.nextInt();
        int[] arr = new float[n];

        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}