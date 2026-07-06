import java.util.Scanner;

class Main {

    public static void avgOfEven(int[] arr, int n){
        double sum =0;
        int len = 0;
        for(int i=0; i<n; i++){
            if(arr[i]%2 ==0){
                sum +=arr[i];
                len++;
            }
        }

        double avg = sum / len;
        System.out.printf("%.2f\n", avg);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }

        avgOfEven(arr, n);
    }
}