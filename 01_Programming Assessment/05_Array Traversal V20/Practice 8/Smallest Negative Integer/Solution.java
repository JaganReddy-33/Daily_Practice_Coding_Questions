import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }

        smallestNegativeInteger(arr, n);
    }

    public static void smallestNegativeInteger(int[] arr, int n){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i] < 0 && arr[i] < smallest){
                smallest = arr[i];
            }
        }
        if(smallest == Integer.MAX_VALUE){
            System.out.print(-1);
        } else {
            System.out.print(smallest);
        }
    }
}