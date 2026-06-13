import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        
        printOddIndexElements(arr);
    }

    public static void printOddIndexElements(int[] arr) {
        for(int i=0; i<arr.length; i++){
            if(i%2 != 0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}