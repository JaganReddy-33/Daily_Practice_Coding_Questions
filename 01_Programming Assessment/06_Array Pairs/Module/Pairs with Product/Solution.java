import java.util.Scanner;

public class Main {

    public static void printProductPairs(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]*arr[j] == target){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i]=scanner.nextInt();
        }

        int target = scanner.nextInt();
        printProductPairs(arr, target);
        
    }
}