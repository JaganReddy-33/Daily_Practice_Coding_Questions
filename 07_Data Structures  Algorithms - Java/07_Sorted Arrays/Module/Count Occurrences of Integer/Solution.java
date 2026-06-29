import java.util.Scanner;

public class Main {

    public static void countOccOfInt(int[] arr, int k){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == k){
                count++;
            }
        }
        System.out.print(count);
    }

 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] arr = new int[N];
    for(int i=0; i<N; i++){
        arr[i]=scanner.nextInt();
    }
    int k = scanner.nextInt();

    countOccOfInt(arr, k)
 
 }
}