import java.util.Scanner;

public class Main {

    public static void printElementNotInSorting(int[] arr){
        boolean found = false;
        for(int i=1; i<arr.length; i++){
            if(arr[i] < arr[i-1]){
                System.out.println(arr[i]);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.print(-1);
        }    
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }

        printElementNotInSorting(arr);
    }
}