import java.util.Scanner;
public class Main {

    public static void findLargestElementOcc(int[] arr){
        int largestval = arr[0];
        int count = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i] > largestval){
                largestval = arr[i];
                count = 1;
            } else if(arr[i] == largestval){
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

        findLargestElementOcc(arr);
    }
}