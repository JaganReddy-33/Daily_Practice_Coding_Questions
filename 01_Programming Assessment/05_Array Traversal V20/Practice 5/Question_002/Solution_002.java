import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }

        findSmallestEvenNum(arr, n);
    }

    public static void findSmallestEvenNum(int[] arr, int n){
        long min = Long.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i]%2 == 0){
                if(arr[i] < min){
                    min = arr[i];
                }
            }
        }

        if(min == Long.MAX_VALUE){
            System.out.print(-1);
        } else {
            System.out.print(min);
        }
    } 
}