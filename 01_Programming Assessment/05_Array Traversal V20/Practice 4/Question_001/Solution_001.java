import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        printPosAndNegEleSeparation(arr, n);
    }

    public static void printPosAndNegEleSeparation(int[] arr, int n){
        for(int i=0; i<n; i++){
            if(arr[i] > 0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();

        for(int i=0; i<n; i++){
            if(arr[i]<0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}