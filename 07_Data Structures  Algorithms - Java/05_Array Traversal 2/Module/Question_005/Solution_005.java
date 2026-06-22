import java.util.Scanner;
public class Main {

    public static void smallestEleOcc(int[] arr){
        int minVal = arr[0];
        int count = 1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < minVal){
                minVal = arr[i];
                count = 1;
            } else if(arr[i] == minVal){
                count++;
            }
        } 
        System.out.print(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }

        smallestEleOcc(arr);
    }
}