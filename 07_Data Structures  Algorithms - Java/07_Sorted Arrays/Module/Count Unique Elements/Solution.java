import java.util.Scanner;

public class Main {

    public static void countUniqueEle(int[] arr, int n){
        int count = 0;
        for(int i=0; i<n; i++){
            boolean isUnique = true;
            if(i>0 && arr[i] == arr[i-1]){
                isUnique = false;
            }
            if(i<n-1 && arr[i] == arr[i+1]){
                isUnique = false;
            }
            if(isUnique){
                count++;
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

        countUniqueEle(arr, N);
       
    }
}