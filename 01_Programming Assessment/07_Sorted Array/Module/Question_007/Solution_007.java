import java.util.Scanner;

public class Main {

    public static void smallestEleCountOccurence(int[] arr){
        int count = 1;
        int smallest = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] == smallest){
                count++;
            } else {
                break;
            }
        }
        System.out.print(count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i]=scanner.nextInt();
        }

        smallestEleCountOccurence(arr);
        
    }
}