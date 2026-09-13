import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }

        elementsGreaterThanAvg(arr, n);
    }

    public static void elementsGreaterThanAvg(int[] arr, int n){
        boolean found = false;
        long sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        int avg = (int) sum / n;

        for(int i=0; i<n; i++){
            if(arr[i] > avg){
                System.out.print(arr[i]+" ");
                found = true;
            }
        }
        if(!found){
            System.out.print("None");
        }
    }
}