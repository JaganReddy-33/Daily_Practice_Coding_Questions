import java.util.Scanner;

public class Main {

    public static void maxProductPair(int[] arr){
        int max1 = Integer.MIN_VALUE:
        int max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE:
        int min2 = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max1){
                max2 = max1;
                max1 = arr[i];
            } else if(arr[i]>max2){
                max2 = arr[i];
            }

            if(arr[i]<min1){
                min2 = min1;
                min1 =arr[i];
            } else if(arr[i]<min2){
                min2 = arr[i];
            }
        }

        int p1 = max1 * max2;
        int p2 = min1 * min2;
        System.out.println(Math.max(p1, p2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int[] arr  =new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=scanner.nextInt();
        }

        maxProductPair(arr);
    }
}