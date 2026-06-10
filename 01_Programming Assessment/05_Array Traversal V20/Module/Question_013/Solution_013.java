import java.util.Scanner;

public class Main {

    public static int findSecondSmallest(int[] array) {
        int SmallVal = Integer.MAX_VALUE;
        int SecondSmallVal = Integer.MAX_VALUE;

        for(int i=0; i<array.length; i++){
            if(array[i] < SmallVal){
                SecondSmallVal = SmallVal;
                SmallVal = array[i];
            } else if(array[i] < SecondSmallVal){
                SecondSmallVal = array[i];
            }
        }
        return SecondSmallVal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for(int i=0; i<n; i++){
            array[i] = scanner.nextInt();
        }

        int res = findSecondSmallest(array);
        System.out.print(res);
    }
}