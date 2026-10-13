import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        printElementsEqualsToIdx(arr, n);
    }

    public static void printElementsEqualsToIdx(int[] arr, int n) {
        int count = 0;

        for(int i=0; i<n; i++) {
            if(arr[i] == i){
                count++;
            }
        }
        System.out.print(count);
    }
}