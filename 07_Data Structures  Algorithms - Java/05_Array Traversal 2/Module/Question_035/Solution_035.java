import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr  =new int[size];
        for(int i=0; i<size; i++){
            arr[i]=scanner.nextInt();
        }

        int res = findMissingElement(arr);
        System.out.print(res);
    }

    public static int findMissingElement(int[] array) {
       int n = array.length;
       int target = n+1;
       int originalSum = (target * (target + 1)) / 2;
       int actualSum = 0
       for(int i=0; i<n; i++){
        actualSum+=array[i];
       }
       int missingEle = originalSum - actualSum;
       return missingEle; 
    }
}