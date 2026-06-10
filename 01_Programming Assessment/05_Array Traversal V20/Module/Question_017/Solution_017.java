import java.util.Scanner;
public class Main {
    public static void swappingIndexes(int[] arr){
        for(int i=0; i<arr.length-1; i+=2){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Swapping:");
        for(int i=0; i<N; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        swappingIndexes(arr);

        System.out.println("After Swapping:");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}