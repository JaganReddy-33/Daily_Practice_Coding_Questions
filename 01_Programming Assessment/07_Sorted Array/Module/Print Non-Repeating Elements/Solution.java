import java.util.Scanner;

public class Main {

    public static void printNonRepeatingEle(int[] arr){
        for(int i=0; i<arr.length; i++){
            boolean isUnique = true;
            if(i>0 && arr[i] == arr[i-1]){
                isUnique = false;
            }
            if(i<arr.length-1 && arr[i] == arr[i+1]){
                isUnique = false;
            }
            if(isUnique){
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }

        printNonRepeatingEle(arr);
        
}
}