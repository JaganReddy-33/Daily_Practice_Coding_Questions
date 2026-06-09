import java.util.Scanner;

public class Main {

    public static int findMaxPairSum(int[] array) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++){
            if(array[i]>max1){
                max2 = max1;
                max1 = array[i];
            } else if(array[i] > max2){
                max2 = array[i];
            }
        }
        int pairSum = (max1 + max2);
        return pairSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array =new int[n];
        for(int i=0; i<n; i++){
            array[i] = scanner.nextInt();
        }

        int res = findMaxPairSum(array);
        System.out.print(res);
    }
}