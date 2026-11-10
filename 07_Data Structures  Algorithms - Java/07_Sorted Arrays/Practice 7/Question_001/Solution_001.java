import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        printElementsGreaterThanIndex(arr, n);
    }

    public static void printElementsGreaterThanIndex(int[] arr, int n) {
        boolean found = false;

        for(int i=0; i<n; i++) {
            if(arr[i] > i){
                System.out.print(arr[i] + " ");
                found = true;
            }
        }

        if(!found) {
            System.out.print("-1");
        }
    }
}