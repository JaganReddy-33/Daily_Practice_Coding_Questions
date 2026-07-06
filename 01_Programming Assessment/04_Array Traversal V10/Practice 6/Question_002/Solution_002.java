import java.util.Scanner;

class Main {

    public static void avgOfOddIdx(int[] arr, int n){
        double sum = 0;
        int len = 0;
        if(n<1){
            System.out.print("None");
            return;
        }
        for(int i=0; i<n; i++){
            if(i%2 != 0){
                sum += arr[i];
                len++;
            }
        }

        if(len == 0){
            System.out.print("None");
        } else {
            double avg = sum / len;
            System.out.printf("%.2f\n", avg);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }

        avgOfOddIdx(arr, n);
    }
}