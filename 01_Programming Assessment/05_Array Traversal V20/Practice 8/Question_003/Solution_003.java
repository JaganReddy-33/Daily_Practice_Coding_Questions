import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        occurrenceOfSmallestEle(arr, n);
    }

    public static void occurrenceOfSmallestEle(int[] arr, int n){
        long min = Long.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        int count = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == min){
                count++;
            }
        }
        System.out.print(count); 
    }
}