import java.util.HashMap; 
import java.util.Scanner;

public class Main {

    public static void countOccurrence(int[] arr){
        int count= 1;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                count++;
            } else {
                System.out.println(arr[i] + " " + count);
                count = 1;
            }
        }
        System.out.println(arr[arr.length-1] + " "+ count);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i]=scanner.nextInt();
        }

        countOccurrence(arr);
        
    }
}