import java.util.Scanner;

public class Main {

    public static void pairValues(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=scanner.nextInt();
        }
        pairValues(arr);
    }
}