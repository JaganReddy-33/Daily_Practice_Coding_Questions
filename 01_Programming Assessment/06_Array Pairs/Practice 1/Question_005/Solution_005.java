import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();

        printPairsGreaterThanK(arr, n, k);
    }

    public static void printPairsGreaterThanK(int[] arr, int n, int k){
        boolean found = false;

        for(int i=0; i<n-1; i++){
            if(arr[i] > k){
                for(int j=i+1; j<n; j++){
                   System.out.print(arr[i] + " " + arr[j]);
                   found = true; 
                }
            }
        }

        if(!found){
            System.out.print("None");
        }
    }
}