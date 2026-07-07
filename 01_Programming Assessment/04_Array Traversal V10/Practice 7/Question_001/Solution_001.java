import java.util.Scanner;

class Main {

    public static void productOfFloat(float[] arr, int n){
        double prod = 1.0;
        for(int i=0; i<n; i++){
            prod *= arr[i];
        }
        System.out.printf("%.2f\n", prod);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        float[] arr = new float[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextFloat();
        }

        productOfFloat(arr, n);
    }
}