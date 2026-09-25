import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        indexOfSecondLargesEle(arr, n);
    }

    public static void indexOfSecondLargesEle(int[] arr, int n){
        long max = Long.MIN_VALUE;
        long secMax = Long.MIN_VALUE;
        int idx1 = -1;
        int idx2 = -1;
        for(int i=0; i<n; i++){
            if(arr[i] > max){
                secMax = max;
                max = arr[i];
                idx2 = idx1;
                idx1 = i;
            } else if(arr[i] > secMax && arr[i] != max){
                secMax = arr[i];
                idx2 = i;
            }
        }
        if(secMax == Long.MIN_VALUE){
            System.out.print(-1);
        } else {
            System.out.print(idx2);
        }
    }
}