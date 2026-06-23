import java.util.Scanner;

public class Main {

    public static void printRepeatingEle(int[] arr){
        boolean isElementFound = false;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                System.out.print(arr[i]+" ");
                isElementFound = true;

                while(i<arr.length-1 && arr[i] == arr[i+1]){
                    i++;
                }
            }
        }
        if(!isElementFound){
            System.out.print(-1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i]=scanner.nextInt();
        }

        printRepeatingEle(arr);
    }
}