import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        elementsWithinRange(arr, n, L, R);
    }

    public static void elementsWithinRange(int[] arr, int n, int L, int R){
        boolean found = false;
        for(int i=0; i<n; i++){
            if(arr[i]>=L && arr[i]<=R ){
                System.out.print(arr[i]+" ");
                found = true;
            }
        }
        if(!found){
            System.out.print("None");
        }
    }
}