import java.util.Scanner;

public class Main {

    public static void indexOfSmallestEle(int[] arr){
        int min = arr[0];
        int index = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                index = i;
            }
        }
        System.out.print(index);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr =new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }

        indexOfSmallestEle(arr);
       
    }
}