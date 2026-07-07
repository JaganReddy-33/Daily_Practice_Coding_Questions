import java.util.Scanner;

class Main {

    public static void DiffInAvg(int[] arr, int n){
        long posSum = 0;
        int posLen = 0;
        long negSum = 0;
        int negLen = 0;
        for(int i=0; i<n; i++){
            if(arr[i] > 0){
                posSum += arr[i];
                posLen++;
            } else if(arr[i] < 0){
                negSum += arr[i];
                negLen++;
            }
        }

        double posAvg = (posLen > 0) ? (double) posSum / posLen : 0;
        double negAvg = (negLen > 0) ? (double) negSum / negLen : 0;

        double diff = posAvg - negAvg;
        System.out.printf("%.2f\n", diff);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }

        DiffInAvg(arr, n);
    }
}