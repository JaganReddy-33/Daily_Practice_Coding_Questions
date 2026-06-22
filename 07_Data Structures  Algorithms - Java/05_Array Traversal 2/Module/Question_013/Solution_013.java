import java.util.Scanner;

public class Main {

    public static int findSecondSmallest(int[] array) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int i=0; i<array.length; i++){
            if(array[i] < min1){
                min2 = min1;
                min1 = array[i];
            } else if(array[i] < min2){
                min2 = array[i];
            }
        }
        return min2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }

        int res = findSecondSmallest(arr);
        System.out.print(res);
    }
}