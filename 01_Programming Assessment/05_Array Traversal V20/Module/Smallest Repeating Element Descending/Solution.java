import java.util.Scanner;

public class Main {

    public static void smallestRepeatingElement(int[] arr){
        int smallestVal = Integer.MAX_VALUE;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                if(arr[i] < smallestVal){
                    smallestVal = arr[i];
                }
            }
        }
        if(smallestVal == Integer.MAX_VALUE){
            System.out.print(-1);
        } else {
            System.out.print(smallestVal);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = scanner.nextInt();
        }

        smallestRepeatingElement(arr);
        
    }
}