import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        printUniqueEle(arr, n);
    }

    public static void printUniqueEle(int[] arr, int n) {
        
        for(int i=0; i<n; i++){
            boolean isFirstOccur = (i==0) || (arr[i] != arr[i-1]);

            if(isFirstOccur){
                System.out.print(arr[i] + " ");
            }
        }
    }
}