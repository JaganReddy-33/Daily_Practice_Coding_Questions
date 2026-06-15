import java.util.Scanner;

public class Main {

    public static void minProductOfPair(int[] arr){
        long min1 = Long.MAX_VALUE, min2 = Long.MAX_VALUE;
        long max1 = Long.MIN_VALUE, max2 = Long.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min1){
                min2 = min1;
                min1 = arr[i];
            } else if(arr[i] < min2){
                min2 = arr[i];
            }

            if(arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            } else if(arr[i] > max2){
                max2 = arr[i];
            }
        }
        long p1 = min1 * min2;
        long p2 = max1 * max2;
        long p3 = min1 * max1;
        System.out.print(Math.min(p1, Math.min(p2, p3)));
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        minProductOfPair(arr);
        
    }
}