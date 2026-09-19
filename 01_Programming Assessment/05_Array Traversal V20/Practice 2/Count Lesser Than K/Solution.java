import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        int k =scanner.nextInt();

        printCountLesserThanK(arr, n, k);
    }

    public static void printCountLesserThanK(int[] arr, int n, int k){
        int count = 0;
        for(int i=0; i<n; i++){
            if(arr[i]<k){
                count++;
            }
        }
        System.out.print(count);
    }
}